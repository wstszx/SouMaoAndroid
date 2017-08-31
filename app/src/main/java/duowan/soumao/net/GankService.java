package duowan.soumao.net;

import java.util.Map;

import duowan.soumao.bean.LoginBean;
import duowan.soumao.bean.ResultBean;
import duowan.soumao.bean.TestBean;
import io.reactivex.Flowable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by wstszx on 2017/7/26.
 */

public interface GankService<T> {
	@FormUrlEncoded
	@POST("{path1}/{path2}")
	Flowable<LoginBean> login(
			@Path("path1") String path1,
			@Path("path2") String path2,
			@FieldMap Map<String, String> map
	);
	@GET("{path1}/{path2}")
	Flowable<TestBean> testData(
			@Header("authorization") String authorization,
			@Path("path1") String path1,
			@Path("path2") String path2,
			@Query("id") String id
	);
}
