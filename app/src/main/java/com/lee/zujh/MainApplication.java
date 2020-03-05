package com.lee.zujh;

import android.app.Application;

import com.lee.componentlib.Appconfig;
import com.lee.componentlib.IAppliction;
import com.lee.homecomponent.HomeActivity;
import com.lee.homecomponent.HomeService;

public class MainApplication extends Application implements IAppliction {

    private static MainApplication application;

    public static MainApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application application) {
        for (String componend : Appconfig.component){
            try {
                Class<?> clazz = Class.forName(componend);
                Object object = clazz.newInstance();
                if (object instanceof IAppliction){
                    ((IAppliction) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
