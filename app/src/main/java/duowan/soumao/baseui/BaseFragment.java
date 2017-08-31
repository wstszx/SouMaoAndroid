package duowan.soumao.baseui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Toast;

import cn.droidlover.xdroidmvp.mvp.IPresent;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;
import duowan.soumao.App;
import duowan.soumao.R;

/**
 * Created by hasee on 2017/8/27.
 */

public abstract class BaseFragment<P extends IPresent> extends XLazyFragment<P> {
	private static final String TAG = "Ly - . -";
	private Toast toast;
	private ProgressDialog progressDialog;


	/**
	 * 显示吐司
	 *
	 * @param msg
	 */
	public void showTs(String msg) {
		if (toast != null) {
			toast.cancel();
			toast = null;
		}
		toast = Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT);
		toast.show();
	}

	/**
	 * 显示菊花
	 * 使用默认提示
	 */
	public void showDialog() {
		showDialog(getString(R.string.tips_loading));
	}

	/**
	 * 显示菊花
	 *
	 * @param msg
	 */
	public void showDialog(String msg) {
		progressDialog = new ProgressDialog(getActivity());
		progressDialog.setMessage(msg);
		progressDialog.show();
	}

	/**
	 * 隐藏掉菊花
	 */
	public void dissDialog() {
		if (progressDialog != null && progressDialog.isShowing()) {
			progressDialog.dismiss();
		}
	}

	/**
	 * 显示log
	 *
	 * @param msg
	 */
	public void showLog(String msg) {
		if (App.isBebug()) {
			Log.e(TAG, "showLog: " + msg);
		}
	}


	public static void launch(Activity activity) {

	}

}
