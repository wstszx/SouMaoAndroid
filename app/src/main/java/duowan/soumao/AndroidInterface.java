package duowan.soumao;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;

import com.google.gson.JsonObject;
import com.just.library.AgentWeb;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import cn.droidlover.xdroidmvp.mvp.VDelegate;
import cn.droidlover.xdroidmvp.mvp.VDelegateBase;

/**
 * Created by wstszx on 2017/8/24.
 */

public class AndroidInterface {
	Context context;
	AgentWeb agentWeb;
	String jsonObject;


	public AndroidInterface(Context context, AgentWeb agentWeb) {
		this.context = context;
		this.agentWeb = agentWeb;
	}

	@JavascriptInterface
	public void openCamera() {


	}

	@JavascriptInterface
	public void showMessage(String me) {
		VDelegateBase.create(context).toastShort(me);
	}

	@JavascriptInterface
	public void uploadImage(String jsonObject) {
		this.jsonObject = jsonObject;
		VDelegateBase.create(context).toastShort(jsonObject.toString());
	}

	@JavascriptInterface
	public void callHandler(String four) {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("name", "45");
			VDelegateBase.create(context).toastShort(jsonObject.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		agentWeb.getJsEntraceAccess().quickCallJs(four, jsonObject.toString());
	}
}



