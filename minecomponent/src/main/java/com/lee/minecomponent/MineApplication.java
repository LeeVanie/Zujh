package com.lee.minecomponent;

import android.app.Application;

import com.lee.componentlib.IAppliction;
import com.lee.componentlib.ServiceFactory;

public class MineApplication extends Application implements IAppliction {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    // 当mine是application时，调用initializa方法，上下文指向HomeApplication
    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    // 当mine是lib时，被主APP调用赋值
    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setMineInter(new MineService());
    }
}
