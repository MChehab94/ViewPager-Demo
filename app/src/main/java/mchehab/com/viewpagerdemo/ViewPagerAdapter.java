package mchehab.com.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by muhammadchehab on 12/7/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> listFragments;
    private List<String> listTitle;

    public ViewPagerAdapter(FragmentManager fragmentManager, List<Fragment> listFragments,
                            List<String> listTitle) {
        super(fragmentManager);
        this.listFragments = listFragments;
        this.listTitle = listTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }
}
