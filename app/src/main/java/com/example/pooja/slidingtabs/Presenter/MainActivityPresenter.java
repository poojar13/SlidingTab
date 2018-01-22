package com.example.pooja.slidingtabs.Presenter;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.animation.RotateAnimation;

import com.ToxicBakery.viewpager.transforms.BackgroundToForegroundTransformer;
import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.example.pooja.slidingtabs.Model.Adapter.ViewPagerAdapter;
import com.example.pooja.slidingtabs.R;
import com.example.pooja.slidingtabs.View.Fragments.Tab1Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab2Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab3Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab4Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab5Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab6Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab7Fragment;
import com.example.pooja.slidingtabs.View.Fragments.Tab8Fragment;

/**
 * Created by pooja on 22/1/18.
 */

public class MainActivityPresenter {

    Tab2Fragment tab2Fragment;
    Tab1Fragment tab1Fragment;
    Tab3Fragment tab3Fragment;
    Tab4Fragment tab4Fragment;
    Tab5Fragment tab5Fragment;
    Tab6Fragment tab6Fragment;
    Tab7Fragment tab7Fragment;
    Tab8Fragment tab8Fragment;
    ViewPagerAdapter adapter;

    public void setupViewPager(ViewPager viewPager, FragmentManager fragmentManager,Activity activity)
    {
        adapter = new ViewPagerAdapter(fragmentManager);
        tab1Fragment=new Tab1Fragment();
        tab2Fragment=new Tab2Fragment();
        tab3Fragment=new Tab3Fragment();
        tab4Fragment = new Tab4Fragment();
        tab5Fragment= new Tab5Fragment();
        tab6Fragment= new Tab6Fragment();
        tab7Fragment= new Tab7Fragment();
        tab8Fragment= new Tab8Fragment();
        adapter.addFragment(tab1Fragment,activity.getString(R.string.tab1));
        adapter.addFragment(tab2Fragment,activity.getString(R.string.tab2));
        adapter.addFragment(tab3Fragment,activity.getString(R.string.tab3));
        adapter.addFragment(tab4Fragment,activity.getString(R.string.tab4));
        adapter.addFragment(tab5Fragment,activity.getString(R.string.tab5));
        adapter.addFragment(tab6Fragment,activity.getString(R.string.tab6));
        adapter.addFragment(tab7Fragment,activity.getString(R.string.tab7));
        adapter.addFragment(tab8Fragment,activity.getString(R.string.tab8));
        viewPager.setPageTransformer(true,new BackgroundToForegroundTransformer());
        viewPager.setAdapter(adapter);
    }

    public void viewPagerListner(final ViewPager viewPager){
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position,false);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
