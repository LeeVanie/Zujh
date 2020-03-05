package com.lee.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface IHomeService {

    void launch(Context context, String stringClass);


    Fragment getHomeFragmentInfo(FragmentManager fragmentManager, int viewId, Bundle bundle);

}
