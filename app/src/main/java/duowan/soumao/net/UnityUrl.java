package duowan.soumao.net;

/**
 * Created by hasee on 2017/8/27.
 */

public class UnityUrl {
	//	登陆
	public String login = "tokens/login";


	private volatile static UnityUrl instance = null;

	public static UnityUrl newInstance() {
		if (instance == null) {
//先检查实例是否存在,如果不存在进入下面的同步块
			synchronized (UnityUrl.class) {
				if (instance == null) {
//再次检查实例是否存在，如果不存在才真正的创建实例
					instance = new UnityUrl();
				}
			}
		}
		return instance;
	}
}
