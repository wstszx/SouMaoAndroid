package duowan.soumao.net;

import java.util.Map;

import duowan.soumao.bean.LoginBean;
import duowan.soumao.bean.SendCodeBean;
import duowan.soumao.constants.UrlConstants;
import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by wstszx on 2017/7/26.
 */

public interface GankService<T> {
	@FormUrlEncoded
	@POST(UrlConstants.login)
	Flowable<LoginBean> login(
			@FieldMap Map<String, String> map
	);
	//发送验证码
	@GET(UrlConstants.sendcode)
	Flowable<SendCodeBean> sendcode(
			@Header("authorization") String authorization,
			@Query("userParam") String userParam
	);
}
