package duowan.soumao.constants;

/**
 * Created by wstszx on 2017/9/11.
 */

public class UrlConstants {

	/*用户接口类*/
//	用户登录
	public static final String login = "app/login/verifyLogin";
	//	发送验证码
	public static final String sendcode = "app/login/sendcapture";
	//	更改密码
	public static final String changePassword = "app/login/password";


	/*首页接口类*/
//发布状态
	public static final String releaseStatus = "app/home/editor";
	//状态或者审核记录的删除
	public static final String deleteRecord = "app/home/remove";
	//消息的展示
	public static final String showMessage = "app/home/list";
	//审核消息中的线索详情
	public static final String clueDetails = "app/home/getOne";
	//审核消息中的用户详情
	public static final String userDetails = "app/home/getOne";
	//审核消息中的通过处理
	public static final String passDealwith = "app/home/passmsg";
	//审核消息中的驳回处理
	public static final String rejectDealwith = "app/home/rejectmsg";
	//得到销售统计
	public static final String getSalesStatistics = "app/home/main";
	//筛选审批消息后的消息展示
	public static final String filterApproval = "app/home/filter";
	//新建线索
	public static final String newClue = "app/clue/save";
	//新建联系人
	public static final String newContactPerson = "app/explore/addContact";
	//新建联系记录
	public static final String newContactRecord = "app/potentuser/savecontactred";
	//新建日程
	public static final String newSchedule = "app/schedule/save";

	/*线索管理*/
/*线索池*/
//线索列表
	public static final String clueList = "app/clue/list";
	//线索详情
	public static final String clueDetail = "app/clue/getOne";
	//线索保存
	public static final String clueSave = "app/clue/saveclue";
	//线索删除
	public static final String clueDelete = "app/clue/remove";
	//线索修改
	public static final String clueModify = "app/clue/update";
	//	线索修改
	public static final String clueAbandon = "app/clue/abandon";

	/*客户*/
//客户列表查询
	public static final String customerListQuery = "app/potentuser/list";
	//客户删除
	public static final String customerDelete = "app/potentuser/remove";
	//查询客户和客户详情
	public static final String queryCustomerAndDetails = "app/potentuser/getOne";
	//编辑客户
	public static final String editCustomer = "app/potentuser/update";
	//客户保存
	public static final String saveCustomer = "app/potentuser/save";
	//客户联系记录
	public static final String CustomerContactRecord = "app/potentuser/contactrecord";
	//新建客户联系记录
	public static final String newCustomerContactRecord = "app/potentuser/savecontactred";
	//客户联系记录修改
	public static final String CustomerContactRecordModify = "app/potentuser/updatecontactred";
	//客户联系记录删除
	public static final String CustomerContactRecordDelete = "app/potentuser/removecontactred";
	//客户联系记录查询
	public static final String CustomerContactRecordQuery = "app/potentuser/getOneContactRed";
	//客户转交
	public static final String CustomerCareOf = "app/potentuser/savemessage";
	//客户放弃
	public static final String CustomerGiveUp = "app/potentuser/abandon";

	/*订单*/
	public static final String order = "app/order/list";
	//订单详情
	public static final String orderDetails = "app/order/getOne";
	//查询客户
	public static final String queryCustomer = "app/order/potentusersearch";
	//查询产品
	public static final String queryProduct = "app/order/productsearch";
	//保存订单
	public static final String saveOrder = "app/order/save";
	//修改订单
	public static final String modifyOrder = "app/order/update";
	//删除订单
	public static final String deleteOrder = "app/order/delete";

	//	产品
	public static final String product = "app/product/list";
	//	产品详情
	public static final String productDetails = "app/product/getOne";
	//	保存产品
	public static final String saveProduct = "app/product/save";
	//	修改产品
	public static final String modifyProduct = "app/product/update";
	//	删除产品
	public static final String deleteProduct = "app/product/delete";
	//	批量删除产品
	public static final String batchDeleteProduct = "app/product/batchremove";

	/*数据分析*/
//	点击账号的时候查询所有的组
	public static final String clickAccountQueryAllGroups = "app/dataAnalyse/findgroup";
	//根据组分组完成后查询相关的根据账户
	public static final String accordingToGroupsQuery = "app/dataAnalyse/work";
	//点击组的时候显示相关的数据
	public static final String clickGroupsShowData = "app/dataAnalyse/groupwork";

	/*日程安排*/
//	查看所有日程
	public static final String viewAllSchedule = "app/schedule/findAll";
	//	查看单个日程
	public static final String viewSchedule = "app/schedule/findById";
	//	添加日程
	public static final String addSchedule = "app/schedule/save";
	//	删除日程
	public static final String deleteSchedule = "app/schedule/delete";
	//	修改日程
	public static final String modifySchedule = "app/schedule/update";

	/*企业详情*/
//	查询股东信息
	public static final String queryStockholdersDetails = "app/cmpydetail/queryInvestorById";
	//	查询企业融资信息数量
	public static final String queryCompanyFinancingMessageCount = "app/cmpydetail/queryInvestorCountById";
	//	查询企业部门职位人员信息
	public static final String queryCompanyDepartmentPositionPersonData = "app/cmpydetail/queryPersonById";
	//	查询企业部门职位人员数量
	public static final String queryCompanyDepartmentPositionPersonCount = "app/cmpydetail/queryPersonCountById";
	//分支机构
	public static final String branches = "app/cmpydetail/queryBranchById";
	//查询分支信息数量
	public static final String queryBranchesMessageCount = "app/cmpydetail/queryBranchCountById";
	//查询公司联系人信息
	public static final String queryCompanyContactPersonMessage = "app/cmpydetail/queryContactInfo";
	//查询社交媒体联系人信息
	public static final String querySocialMediaContactPersonMessage = "app/cmpydetail/querySocialContactInfo";
	//查询网站备案联系人信息
	public static final String queryWebsiteFilingContactPersonMessage = "app/cmpydetail/querySocialContactInfo";
	//查询公司的竞争力
	public static final String queryCompanyCompetitiveness = "app/cmpydetail/queryCompetenceScore";
	//查询企业融资图信息
	public static final String queryCompanyFinancingMessage = "app/cmpydetail/queryInvRound";
	//基础信息
	public static final String foundationMessage = "app/cmpydetail/queryCorpDetailById";
	//公司详情/企业信息首页
	public static final String companyDetails = "app/cmpydetail/corpDetail";
	//新建公司联系人
	public static final String newCompanyContactPerson = "app/cmpydetail/addContact";
	//新建社交联系人
	public static final String newSocialContactPerson = "app/cmpydetail/addMedContact";
	//查询公司主要人员
	public static final String queryCompanyKeyPersonnel = "app/cmpydetail/selectMain";
	//查询公司切入点信息大类
	public static final String queryCompanyEntryPointMessageWebgame = "app/cmpydetail/queryPointType";
	//查询公司切入点大类的具体信息
	public static final String queryCompanyEntryPointDetails = "app/cmpydetail/queryPointTypeDetailInfo";

	/*个人中心*/
//	个人信息
	public static final String personalInformation = "app/personal/userInfo";
	//	编辑信息
	public static final String editInformation = "app/personal/updateself";
	//	修改密码
	public static final String modifyPassword = "app/personal/password";
	//	反馈
	public static final String feedback = "app/personal/feedback";
	//	用户头像上传
	public static final String userAvatarUpload = "app/upload";
}
