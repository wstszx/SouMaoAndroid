package duowan.soumao.bean;

import cn.droidlover.xdroidmvp.net.IModel;

/**
 * Created by wstszx on 2017/8/28.
 */

public class LoginBean implements IModel {


	/**
	 * code : 0
	 * message : 成功
	 * data : {"userId":101,"token":"c86e64e2c60a46b98135846f0087612b"}
	 */

	private int code;
	private String message;
	private DataBean data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DataBean getData() {
		return data;
	}

	public void setData(DataBean data) {
		this.data = data;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public boolean isAuthError() {
		return false;
	}

	@Override
	public boolean isBizError() {
		return false;
	}

	@Override
	public String getErrorMsg() {
		return null;
	}

	public static class DataBean {
		/**
		 * userId : 101
		 * token : c86e64e2c60a46b98135846f0087612b
		 */

		private int userId;
		private String token;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}
	}
}
