package duowan.soumao.net;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wstszx on 2017/8/25.
 */

public class CommonParamsInterceptor implements Interceptor {
	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
		if (request.method().equals("GET")) {
			HttpUrl httpUrl = request.url().newBuilder()
					.addQueryParameter("id", "id")
					.build();
			request=request.newBuilder().url(httpUrl).build();
		} else if (request.method().equals("POST")) {
			if (request.body() instanceof FormBody) {
				FormBody.Builder bodyBuilder = new FormBody.Builder();
				FormBody formBody = (FormBody) request.body();
				for (int i = 0; i < formBody.size(); i++) {
					bodyBuilder.addEncoded(formBody.encodedName(i),formBody.encodedValue(i));
				}
				formBody=bodyBuilder
						.addEncoded("authorization","authorization")
						.build();
				request =request.newBuilder().post(formBody).build();
			}
		}
		return chain.proceed(request);
	}
}
