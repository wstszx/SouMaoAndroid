package duowan.soumao.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.just.library.AgentWeb;

import org.json.JSONException;
import org.json.JSONObject;

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



