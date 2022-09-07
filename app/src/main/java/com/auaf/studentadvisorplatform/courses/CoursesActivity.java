package com.auaf.studentadvisorplatform.courses;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.auaf.studentadvisorplatform.R;
import com.auaf.studentadvisorplatform.courses.fragements.ViewPagerAdapter;
import com.auaf.studentadvisorplatform.courses.fragements.bbaCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.itcsCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.lawCoursesFragment;
import com.auaf.studentadvisorplatform.courses.fragements.polCoursesFragment;
import com.google.android.material.tabs.TabLayout;

public class CoursesActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.courses_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.toolBar));
        getSupportActionBar().setTitle((CharSequence) getString(R.string.courses));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        this.viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(getSupportFragmentManager());
        this.viewPagerAdapter = viewPagerAdapter2;
        viewPagerAdapter2.addFragment(new itcsCoursesFragment(), "");
        this.viewPagerAdapter.addFragment(new bbaCoursesFragment(), "");
        this.viewPagerAdapter.addFragment(new lawCoursesFragment(), "");
        this.viewPagerAdapter.addFragment(new polCoursesFragment(), "");
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.tabLayout.getTabAt(0).setIcon((int) R.drawable.ic_round_itcs).setText((CharSequence) "ITCS");
        this.tabLayout.getTabAt(1).setIcon((int) R.drawable.ic_round_bba).setText((CharSequence) "BBA");
        this.tabLayout.getTabAt(2).setIcon((int) R.drawable.ic_round_law).setText((CharSequence) "LAW");
        this.tabLayout.getTabAt(3).setIcon((int) R.drawable.ic_round_pol).setText((CharSequence) "POL");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
