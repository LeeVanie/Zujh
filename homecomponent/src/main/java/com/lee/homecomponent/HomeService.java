package com.lee.homecomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.lee.componentlib.IHomeService;

public class HomeService implements IHomeService {
    @Override
    public void launch(Context context, String stringClass) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.putExtra(HomeActivity.class.getName(), stringClass);
        context.startActivity(intent);
    }

    @Override
    public Fragment getHomeFragmentInfo(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, fragment).commit();
        return fragment;
    }
}
