package duowan.soumao;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.just.library.AgentWeb;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.droidlover.xdroidmvp.base.XFragmentAdapter;
import cn.droidlover.xdroidmvp.mvp.XActivity;
import cn.droidlover.xdroidmvp.router.Router;
import duowan.soumao.baseui.BaseActivity;
import duowan.soumao.ui.HomeFragment;
import duowan.soumao.ui.LeadManagementFragment;
import duowan.soumao.ui.MyCenterFragment;
import duowan.soumao.ui.ScheduleFragment;
import duowan.soumao.widget.MyDrawerLayout;

public class MainActivity extends BaseActivity
		implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationBar.OnTabSelectedListener {
	@BindView(R.id.toolbar)
	Toolbar toolbar;
	@BindView(R.id.bottom_navigation_view)
	BottomNavigationBar bottomNavigationBar;
	@BindView(R.id.nav_view)
	NavigationView navView;
	@BindView(R.id.drawer_layout)
	MyDrawerLayout drawerLayout;
	@BindView(R.id.toolbar_title)
	TextView toolbarTitle;
	List<Fragment> fragmentList = new ArrayList<>();
	XFragmentAdapter viewPagerAdapter;
	@BindView(R.id.frame_layout)
	FrameLayout frameLayout;
	private HomeFragment homeFragment;
	private LeadManagementFragment leadManagementFragment;
	private ScheduleFragment scheduleFragment;
	private MyCenterFragment myCenterFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ButterKnife.bind(this);
		setSupportActionBar(toolbar);
//修改底部导航栏位移效果
//		setBottomNavigationView();
		MyDrawerLayout drawer = (MyDrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.setDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);
	}
//	修改BottomNavigationView切换样式
//	protected void setBottomNavigationView() {
//		BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationBar.getChildAt(0);
//		try {
//			Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
//			shiftingMode.setAccessible(true);
//			shiftingMode.setBoolean(menuView, false);
//			shiftingMode.setAccessible(false);
//			for (int i = 0; i < menuView.getChildCount(); i++) {
//				BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(i);
//				itemView.setShiftingMode(false);
//				itemView.setChecked(itemView.getItemData().isChecked());
//			}
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void onBackPressed() {
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}


	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId();

		if (id == R.id.nav_camera) {

		} else if (id == R.id.nav_gallery) {
			TestActivity.launch(this);
		} else if (id == R.id.nav_slideshow) {

		} else if (id == R.id.nav_manage) {

		} else if (id == R.id.nav_share) {

		} else if (id == R.id.nav_send) {

		}
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

//	ChromeClientCallbackManager.ReceivedTitleCallback mCallback = new ChromeClientCallbackManager.ReceivedTitleCallback() {
//		@Override
//		public void onReceivedTitle(WebView webView, String s) {
//
//		}
//	};

	@Override
	public void initData(Bundle savedInstanceState) {
//		fragmentList.clear();
//		fragmentList.add(HomeFragment.newInstance());
//		fragmentList.add(LeadManagementFragment.newInstance());
//		fragmentList.add(MyCenterFragment.newInstance());
//		fragmentList.add(ScheduleFragment.newInstance());
		bottomNavigationBar.setBarBackgroundColor(R.color.white);
		bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
		bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);//适应大小
		bottomNavigationBar
				.addItem(new BottomNavigationItem(R.mipmap.home2x, R.string.bottom_one_string)
						.setInactiveIconResource(R.mipmap.home2x)
						.setActiveColorResource(R.color.colorPrimaryDark))
				.addItem(new BottomNavigationItem(R.mipmap.leadmanagement2x, R.string.bottom_two_string)
						.setInactiveIconResource(R.mipmap.leadmanagement2x)
						.setActiveColorResource(R.color.colorPrimaryDark))
				.addItem(new BottomNavigationItem(R.mipmap.schedule2x, R.string.bottom_three_string)
						.setInactiveIconResource(R.mipmap.schedule2x)
						.setActiveColorResource(R.color.colorPrimaryDark))
				.addItem(new BottomNavigationItem(R.mipmap.mycenter2x, R.string.bottom_four_string)
						.setInactiveIconResource(R.mipmap.mycenter2x)
						.setActiveColorResource(R.color.colorPrimaryDark))
				.setFirstSelectedPosition(0)//显示默认面板
				.initialise();//初始化
		homeFragment = HomeFragment.newInstance();
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.replace(R.id.frame_layout, homeFragment);
		fragmentTransaction.commit();
		bottomNavigationBar.setTabSelectedListener(this);
	}

	@Override
	public int getLayoutId() {
		return R.layout.activity_main;
	}

	@Override
	public Object newP() {
		return null;
	}

	@Override
	public void onTabSelected(int position) {
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		switch (position) {
			case 0:
				toolbarTitle.setText(R.string.bottom_one_string);
				homeFragment = HomeFragment.newInstance();
				fragmentTransaction.replace(R.id.frame_layout, homeFragment);
				break;
			case 1:
				toolbarTitle.setText(R.string.bottom_two_string);
				leadManagementFragment = LeadManagementFragment.newInstance();
				fragmentTransaction.replace(R.id.frame_layout, leadManagementFragment);
				break;
			case 2:
				toolbarTitle.setText(R.string.bottom_three_string);
				scheduleFragment = ScheduleFragment.newInstance();
				fragmentTransaction.replace(R.id.frame_layout, scheduleFragment);
				break;
			case 3:
				toolbarTitle.setText(R.string.bottom_four_string);
				myCenterFragment = MyCenterFragment.newInstance();
				fragmentTransaction.replace(R.id.frame_layout, myCenterFragment);
				break;
		}
		fragmentTransaction.commit();
	}

	@Override
	public void onTabUnselected(int i) {

	}

	@Override
	public void onTabReselected(int i) {

	}

	public static void launch(Activity activity) {
		Router.newIntent(activity)
				.to(MainActivity.class)
				.launch();
	}

}
