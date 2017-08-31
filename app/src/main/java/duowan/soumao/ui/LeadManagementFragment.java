package duowan.soumao.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import cn.droidlover.xrecyclerview.XRecyclerView;
import duowan.soumao.R;
import duowan.soumao.adapter.HomeAdapter;
import duowan.soumao.adapter.LeadManagementAdapter;
import duowan.soumao.baseui.BaseFragment;
import duowan.soumao.model.GankResults;

/**
 * 线索管理
 */

public class LeadManagementFragment extends BaseFragment {
	private volatile static LeadManagementFragment instance = null;
	LeadManagementAdapter adapter;

	@Override
	public void initData(Bundle savedInstanceState) {

	}

	@Override
	public int getLayoutId() {
		return R.layout.leadmanagement_fragment;
	}

	@Override
	public Object newP() {
		return null;
	}


	public static LeadManagementFragment newInstance() {
		if (instance == null) {
//先检查实例是否存在,如果不存在进入下面的同步块
			synchronized (LeadManagementFragment.class) {
				if (instance == null) {
//再次检查实例是否存在，如果不存在才真正的创建实例
					instance = new LeadManagementFragment();
				}
			}
		}
		return instance;

	}
}
