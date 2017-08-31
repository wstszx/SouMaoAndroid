package duowan.soumao.login;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.droidlover.xdroidmvp.mvp.XActivity;
import duowan.soumao.MainActivity;
import duowan.soumao.R;
import duowan.soumao.baseui.BaseActivity;

public class LoginActivity extends BaseActivity<LoginP> {

	@Override
	public void initData(Bundle savedInstanceState) {
		getP().login("zengjie3","e10adc3949ba59abbe56e057f20f883e");
	}

	@Override
	public int getLayoutId() {
		if (Build.VERSION.SDK_INT >= 21) {
			View decorView = getWindow().getDecorView();
			decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
			getWindow().setStatusBarColor(Color.TRANSPARENT);
		}
		return R.layout.activity_login;
	}

	@Override
	public LoginP newP() {
		return new LoginP();
	}

	public void showUserNameErr(String err) {

	}

	public void showPasswordErr(String err) {

	}

	public void toMain(){
		MainActivity.launch(LoginActivity.this);
		finish();
	}

}
