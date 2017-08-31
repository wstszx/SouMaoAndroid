package duowan.soumao;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.WindowManager;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cn.droidlover.xdroidmvp.net.NetError;
import cn.droidlover.xdroidmvp.net.NetProvider;
import cn.droidlover.xdroidmvp.net.RequestHandler;
import cn.droidlover.xdroidmvp.net.XApi;
import duowan.soumao.net.CommonParamsInterceptor;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wstszx on 2017/7/28.
 */

public class App extends Application {
	private static Context context;
	// 全局控制(log显示等)
	private static final boolean IS_BEBUG=true;
	@Override
	public void onCreate() {
		super.onCreate();
		XApi.registerProvider(new NetProvider() {
			@Override
			public Interceptor[] configInterceptors() {

				return new Interceptor[0];
			}

			@Override
			public void configHttps(OkHttpClient.Builder builder) {

			}

			@Override
			public CookieJar configCookie() {
				return setCookieJar();

			}

			@Override
			public RequestHandler configHandler() {
				return null;
			}

			@Override
			public long configConnectTimeoutMills() {
				return 0;
			}

			@Override
			public long configReadTimeoutMills() {
				return 0;
			}

			@Override
			public boolean configLogEnable() {
				return true;
			}

			@Override
			public boolean handleError(NetError error) {
				return false;
			}
		});

	}
	public static Context getContext() {
		return context;
	}

	private CookieJar setCookieJar() {
		CookieJar cookieJar = new CookieJar() {
			private final HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap<>();

			@Override
			public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
				cookieStore.put(url, cookies);
			}

			@Override
			public List<Cookie> loadForRequest(HttpUrl url) {
				List<Cookie> cookies = cookieStore.get(url);
				return cookies != null ? cookies : new ArrayList<Cookie>();
			}
		};
		return cookieJar;
	}

	public static boolean isBebug() {
		return IS_BEBUG;
	}
}
