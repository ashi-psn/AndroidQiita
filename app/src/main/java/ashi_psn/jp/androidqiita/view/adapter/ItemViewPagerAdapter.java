package ashi_psn.jp.androidqiita.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ashi_psn.jp.androidqiita.view.fragment.ItemFragment;
import ashi_psn.jp.androidqiita.view.fragment.TagFragment;

/**
 * Created by ashi_psn on 2017/04/29.
 */

public class ItemViewPagerAdapter extends FragmentPagerAdapter {

    public ItemViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ItemFragment.newInstance(ItemFragment.DataSource.USER);
            case 1:
                return TagFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }
}
