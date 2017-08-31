package duowan.soumao;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.just.library.AgentWeb;
import com.just.library.AgentWebView;
import com.just.library.ChromeClientCallbackManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.droidlover.xdroidmvp.mvp.VDelegateBase;
import cn.droidlover.xdroidmvp.router.Router;

/**
 * Created by wstszx on 2017/8/21.
 */

public class TestActivity extends AppCompatActivity {
	@BindView(R.id.agent_webview)
	AgentWebView agentWebview;
	@BindView(R.id.linear_layout)
	LinearLayout linearLayout;
	private AgentWeb agentWeb;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		ButterKnife.bind(this);
		//传入Activity
//传入AgentWeb 的父控件 ，如果父控件为 RelativeLayout ， 那么第二参数需要传入 RelativeLayout.LayoutParams
// 使用默认进度条
// 使用默认进度条颜色
//设置 Web 页面的 title 回调
//
		agentWeb = AgentWeb.with(this)//传入Activity
				.setAgentWebParent(linearLayout, new LinearLayout.LayoutParams(-1, -1))//传入AgentWeb 的父控件 ，如果父控件为 RelativeLayout ， 那么第二参数需要传入 RelativeLayout.LayoutParams
				.useDefaultIndicator()// 使用默认进度条
				.defaultProgressBarColor() // 使用默认进度条颜色
				.setReceivedTitleCallback(mCallback) //设置 Web 页面的 title 回调
				.createAgentWeb()//
				.ready()
				.go("file:///android_asset/testBridge.html");
		agentWeb.getJsInterfaceHolder().addJavaObject("WebViewJavascriptBridge",new AndroidInterface(this,agentWeb));
	}

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
}
