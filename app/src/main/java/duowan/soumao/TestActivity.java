package duowan.soumao;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.just.library.AgentWeb;
import com.just.library.AgentWebSettings;
import com.just.library.AgentWebView;
import com.just.library.ChromeClientCallbackManager;
import com.just.library.DownLoadResultListener;
import com.just.library.PermissionInterceptor;
import com.just.library.WebDefaultSettingsManager;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XActivity;
import cn.droidlover.xdroidmvp.router.Router;
import duowan.soumao.jsinterface.AndroidInterface;


/**
 * Created by wstszx on 2017/8/21.
 */

public class TestActivity extends XActivity {

	@BindView(R.id.agent_webview)
	AgentWebView agentWebview;
	@BindView(R.id.linear_layout)
	RelativeLayout relativeLayout;
	private AgentWeb agentWeb;

	public static void launch(Activity activity) {
		Router.newIntent(activity)
				.to(TestActivity.class)
				.launch();
	}

	ChromeClientCallbackManager.ReceivedTitleCallback mCallback = new ChromeClientCallbackManager.ReceivedTitleCallback() {
		@Override
		public void onReceivedTitle(WebView webView, String s) {

		}
	};

	@Override
	public void initData(Bundle savedInstanceState) {
		agentWeb = AgentWeb.with(this)//传入Activity
				.setAgentWebParent(relativeLayout,new RelativeLayout.LayoutParams(-1, -1))//传入AgentWeb 的父控件 ，如果父控件为 RelativeLayout ， 那么第二参数需要传入 RelativeLayout.LayoutParams
				.useDefaultIndicator()// 使用默认进度条
				.defaultProgressBarColor() // 使用默认进度条颜色
				.setAgentWebSettings(getSettings())
				.setWebViewClient(mWebViewClient)
				.setWebChromeClient(mWebChromeClient)
				.setPermissionInterceptor(mPermissionInterceptor)
				.setReceivedTitleCallback(mCallback) //设置 Web 页面的 title 回调
				.setSecutityType(AgentWeb.SecurityType.strict)
				.addDownLoadResultListener(mDownLoadResultListener)
				.createAgentWeb()//
				.ready()
				.go("file:///android_asset/upload_file/jsuploadfile.html");
//		agentWeb.getJsInterfaceHolder().addJavaObject("WebViewJavascriptBridge", new AndroidInterface(this, agentWeb));

	}

	public AgentWebSettings getSettings() {
		return WebDefaultSettingsManager.getInstance();
	}

	protected DownLoadResultListener mDownLoadResultListener=new DownLoadResultListener() {
		@Override
		public void success(String s) {

		}

		@Override
		public void error(String s, String s1, String s2, Throwable throwable) {

		}
	};

	protected WebChromeClient mWebChromeClient=new WebChromeClient(){
		@Override
		public void onProgressChanged(WebView view, int newProgress) {

		}
	};

	protected WebViewClient mWebViewClient=new WebViewClient(){
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
			return super.shouldOverrideUrlLoading(view, request);
		}

		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {

		}
	};

	protected PermissionInterceptor mPermissionInterceptor=new PermissionInterceptor() {
		@Override
		public boolean intercept(String s, String[] strings, String s1) {
			return false;
		}
	};

	@Override
	public int getLayoutId() {
		return R.layout.test;
	}

	@Override
	public Object newP() {
		return null;
	}

}
