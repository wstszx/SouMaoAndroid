package duowan.soumao.present;

import cn.droidlover.xdroidmvp.cache.SharedPref;
import cn.droidlover.xdroidmvp.mvp.XPresent;
import cn.droidlover.xdroidmvp.net.ApiSubscriber;
import cn.droidlover.xdroidmvp.net.NetError;
import cn.droidlover.xdroidmvp.net.XApi;
import duowan.soumao.bean.SendCodeBean;
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
		Api.getGankService().sendcode(header, "18362052360")
				.compose(XApi.<SendCodeBean>getApiTransformer())
				.compose(XApi.<SendCodeBean>getScheduler())
				.compose(getV().<SendCodeBean>bindToLifecycle())
				.subscribe(new ApiSubscriber<SendCodeBean>() {
					@Override
					public void onNext(SendCodeBean testBean) {
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
