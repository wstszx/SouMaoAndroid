package duowan.soumao.ui;

import android.os.Bundle;

import cn.droidlover.xdroidmvp.base.SimpleRecAdapter;
import cn.droidlover.xrecyclerview.RecyclerItemCallback;
import cn.droidlover.xrecyclerview.XRecyclerView;
import duowan.soumao.R;
import duowan.soumao.adapter.HomeAdapter;
import duowan.soumao.adapter.ScheduleAdapter;
import duowan.soumao.baseui.BaseFragment;
import duowan.soumao.model.GankResults;

/**
 * 日程安排
 */

public class ScheduleFragment extends BaseFragment {
	private volatile static ScheduleFragment instance = null;

	@Override
	public void initData(Bundle savedInstanceState) {

	}

	@Override
	public int getLayoutId() {
		return R.layout.schedule_fragment;
	}

	@Override
	public Object newP() {
		return null;
	}


	public static ScheduleFragment newInstance() {
		if (instance == null) {
//先检查实例是否存在,如果不存在进入下面的同步块
			synchronized (ScheduleFragment.class) {
				if (instance == null) {
//再次检查实例是否存在，如果不存在才真正的创建实例
					instance = new ScheduleFragment();
				}
			}
		}
		return instance;

	}
}
