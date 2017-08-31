package duowan.soumao.bean;

import cn.droidlover.xdroidmvp.net.IModel;

/**
 * Created by wstszx on 2017/8/28.
 */

public class ResultBean<T> implements IModel {
	private int code;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	private String message;
	private T data;

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
}
