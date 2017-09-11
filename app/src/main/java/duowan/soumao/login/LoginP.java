package duowan.soumao.login;

import android.text.TextUtils;

import java.util.HashMap;

import cn.droidlover.xdroidmvp.cache.SharedPref;
import cn.droidlover.xdroidmvp.mvp.XPresent;
import cn.droidlover.xdroidmvp.net.ApiSubscriber;
import cn.droidlover.xdroidmvp.net.NetError;
import cn.droidlover.xdroidmvp.net.XApi;
import duowan.soumao.App;
import duowan.soumao.R;
import duowan.soumao.bean.LoginBean;
import duowan.soumao.bean.ResultBean;
import duowan.soumao.net.Api;

import static android.R.attr.data;

/**
 * Created by hasee on 2017/8/27.
 */

public class LoginP extends XPresent<LoginActivity> {

	public void login(String userName, String passWord) {
		if (TextUtils.isEmpty(userName)) {
			getV().showUserNameErr(getV().getString(R.string.tips_username_is_not_empty));
			return;
		}
		if (TextUtils.isEmpty(passWord)) {
			getV().showPasswordErr(getV().getString(R.string.tips_password_is_not_empty));
			return;
		}
		getV().showDialog();
		HashMap<String, String> map = new HashMap<>();
		map.put("phone", userName);
		map.put("password", passWord);
		Api.getGankService().login(map)
				.compose(XApi.<LoginBean>getApiTransformer())
				.compose(XApi.<LoginBean>getScheduler())
				.compose(getV().<LoginBean>bindToLifecycle())
				.subscribe(new ApiSubscriber<LoginBean>() {
					@Override
					public void onNext(LoginBean loginBean) {
						if (loginBean.getCode() == 0) {
							LoginBean.DataBean data = loginBean.getData();
							String token = data.getToken();
							int userId = data.getUserId();
							SharedPref.getInstance(getV().getBaseContext()).putInt("userId",userId);
							SharedPref.getInstance(getV().getBaseContext()).putString("token",token);
							getV().toMain();
						} else {
							getV().showTs(loginBean.getMessage());
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
