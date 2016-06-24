package com.example.gosnack_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 내컴퓨터 on 2016-06-18.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs)
    {
        super(fm);
        this.tabCount=numberOfTabs;
    }
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 :
                HomeFragment tab1=new HomeFragment();
                return tab1;
            case 1 :
                RankingFragment tab2=new RankingFragment();
                return tab2;
            case 2 :
                LabFragment tab3=new LabFragment();
                return tab3;
            case 3 :
                LottoFragment tab4=new LottoFragment();
                return tab4;
            default:
                return null;

        }
    }
    public int getCount()
    {
        return tabCount;
    }
}
