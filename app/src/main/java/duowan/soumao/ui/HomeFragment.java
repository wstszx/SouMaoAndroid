package duowan.soumao.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xdroidmvp.log.XLog;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import duowan.soumao.R;
import duowan.soumao.adapter.HomeAdapter;
import duowan.soumao.baseui.BaseFragment;
import duowan.soumao.constants.UrlConstants;
import duowan.soumao.login.LoginP;
import duowan.soumao.model.GankResults;
import duowan.soumao.present.HomeP;

/**
 * 主页
 */

public class HomeFragment extends BaseFragment<HomeP> {
	private volatile static HomeFragment instance = null;

	@Override
	public void initData(Bundle savedInstanceState) {
		getP().loadData();
	}

	@Override
	public int getLayoutId() {
		return R.layout.home_fragment;
	}

	@Override
	public HomeP newP() {
		return new HomeP();
	}


	public static HomeFragment newInstance() {
		if (instance == null) {
//先检查实例是否存在,如果不存在进入下面的同步块
			synchronized (HomeFragment.class) {
				if (instance == null) {
//再次检查实例是否存在，如果不存在才真正的创建实例
					instance = new HomeFragment();
				}
			}
		}
		return instance;
	}
}
