package duowan.soumao.bean;

import cn.droidlover.xdroidmvp.net.IModel;

/**
 * Created by wstszx on 2017/8/28.
 */

public class TestBean implements IModel {

	/**
	 * code : 0
	 * message : 成功
	 * data : {"id":"1","exploreName":"智齿科技1","cmpyname":"北京智齿数汇科技有限公司","exploreType":"新潜在客户推荐","area":"香港特别行政区","industry":"林业","description":"lm","userId":16,"cuser":null,"createtime":1503908442000,"updatetime":1503908442000,"runtime":1499414617000,"status":3,"disable":1,"receiveEmail":null,"receivePhone":"18362052360","rviewCount":0,"contactFlag":null,"pageSize":3000,"productName":"leiming11","seedUserId":"zengjie22244_20170621141135","potentialUserId":""}
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
		 * id : 1
		 * exploreName : 智齿科技1
		 * cmpyname : 北京智齿数汇科技有限公司
		 * exploreType : 新潜在客户推荐
		 * area : 香港特别行政区
		 * industry : 林业
		 * description : lm
		 * userId : 16
		 * cuser : null
		 * createtime : 1503908442000
		 * updatetime : 1503908442000
		 * runtime : 1499414617000
		 * status : 3
		 * disable : 1
		 * receiveEmail : null
		 * receivePhone : 18362052360
		 * rviewCount : 0
		 * contactFlag : null
		 * pageSize : 3000
		 * productName : leiming11
		 * seedUserId : zengjie22244_20170621141135
		 * potentialUserId :
		 */

		private String id;
		private String exploreName;
		private String cmpyname;
		private String exploreType;
		private String area;
		private String industry;
		private String description;
		private int userId;
		private Object cuser;
		private long createtime;
		private long updatetime;
		private long runtime;
		private int status;
		private int disable;
		private Object receiveEmail;
		private String receivePhone;
		private int rviewCount;
		private Object contactFlag;
		private int pageSize;
		private String productName;
		private String seedUserId;
		private String potentialUserId;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getExploreName() {
			return exploreName;
		}

		public void setExploreName(String exploreName) {
			this.exploreName = exploreName;
		}

		public String getCmpyname() {
			return cmpyname;
		}

		public void setCmpyname(String cmpyname) {
			this.cmpyname = cmpyname;
		}

		public String getExploreType() {
			return exploreType;
		}

		public void setExploreType(String exploreType) {
			this.exploreType = exploreType;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getIndustry() {
			return industry;
		}

		public void setIndustry(String industry) {
			this.industry = industry;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public Object getCuser() {
			return cuser;
		}

		public void setCuser(Object cuser) {
			this.cuser = cuser;
		}

		public long getCreatetime() {
			return createtime;
		}

		public void setCreatetime(long createtime) {
			this.createtime = createtime;
		}

		public long getUpdatetime() {
			return updatetime;
		}

		public void setUpdatetime(long updatetime) {
			this.updatetime = updatetime;
		}

		public long getRuntime() {
			return runtime;
		}

		public void setRuntime(long runtime) {
			this.runtime = runtime;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getDisable() {
			return disable;
		}

		public void setDisable(int disable) {
			this.disable = disable;
		}

		public Object getReceiveEmail() {
			return receiveEmail;
		}

		public void setReceiveEmail(Object receiveEmail) {
			this.receiveEmail = receiveEmail;
		}

		public String getReceivePhone() {
			return receivePhone;
		}

		public void setReceivePhone(String receivePhone) {
			this.receivePhone = receivePhone;
		}

		public int getRviewCount() {
			return rviewCount;
		}

		public void setRviewCount(int rviewCount) {
			this.rviewCount = rviewCount;
		}

		public Object getContactFlag() {
			return contactFlag;
		}

		public void setContactFlag(Object contactFlag) {
			this.contactFlag = contactFlag;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getSeedUserId() {
			return seedUserId;
		}

		public void setSeedUserId(String seedUserId) {
			this.seedUserId = seedUserId;
		}

		public String getPotentialUserId() {
			return potentialUserId;
		}

		public void setPotentialUserId(String potentialUserId) {
			this.potentialUserId = potentialUserId;
		}
	}
}
