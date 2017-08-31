package duowan.soumao.present;

import cn.droidlover.xdroidmvp.cache.SharedPref;
import cn.droidlover.xdroidmvp.mvp.XPresent;
import cn.droidlover.xdroidmvp.net.ApiSubscriber;
import cn.droidlover.xdroidmvp.net.NetError;
import cn.droidlover.xdroidmvp.net.XApi;
import duowan.soumao.App;
import duowan.soumao.bean.ResultBean;
import duowan.soumao.bean.TestBean;
import duowan.soumao.login.LoginP;
import duowan.soumao.net.Api;
import duowan.soumao.ui.HomeFragment;

/**
 * Created by wstszx on 2017/8/28.
 */

public class HomeP extends XPresent<HomeFragment> {
	public void loadData() {
		int userId = SharedPref.getInstance(getV().getContext()).getInt("userId", 0);
		String token = SharedPref.getInstance(getV().getContext()).getString("token", "");
		String header = userId + "_" + token;
		Api.getGankService().testData(header, "explore", "getOne", "1")
				.compose(XApi.<TestBean>getApiTransformer())
				.compose(XApi.<TestBean>getScheduler())
				.compose(getV().<TestBean>bindToLifecycle())
				.subscribe(new ApiSubscriber<TestBean>() {
					@Override
					public void onNext(TestBean testBean) {
						if (testBean.getCode() == 0) {
							getV().showTs("解析");
							getV().showLog(testBean.getData().toString());
						} else {
							getV().showTs(testBean.getMessage());
						}
					}

					@Override
					protected void onFail(NetError error) {
						getV().showTs(error.getMessage());
					}

					@Override
					public void onComplete() {
						super.onComplete();
						getV().dissDialog();
					}
				});
	}
}
