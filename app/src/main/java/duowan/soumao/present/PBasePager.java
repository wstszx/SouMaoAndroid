package duowan.soumao.present;

import java.util.Map;

import cn.droidlover.xdroidmvp.mvp.XPresent;
import cn.droidlover.xdroidmvp.net.ApiSubscriber;
import cn.droidlover.xdroidmvp.net.NetError;
import cn.droidlover.xdroidmvp.net.XApi;
import duowan.soumao.model.GankResults;
import duowan.soumao.net.Api;
import duowan.soumao.net.GankService;
import duowan.soumao.ui.BasePagerFragment;

/**
 * Created by wstszx on 2017/7/26.
 */

public class PBasePager<T> extends XPresent<BasePagerFragment> {

//	public GankService loadData(String url, Map<T,T> map) {
//		Api.getGankService().getRequest(url,map)
//				.compose(XApi.<GankResults>getApiTransformer())
//				.compose(XApi.<GankResults>getScheduler())
//				.compose(getV().<GankResults>bindToLifecycle())
//				.subscribe(new ApiSubscriber<GankResults>() {
//					@Override
//					protected void onFail(NetError error) {
//						getV().showError(error);
//					}
//
//					@Override
//					public void onNext(GankResults gankResults) {
////						getV().showData(gankResults);
//					}
//				});
//		return Api.getGankService();
//	}

}
