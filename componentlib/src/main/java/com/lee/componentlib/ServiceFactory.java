package com.lee.componentlib;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ServiceFactory() {
    }

    private IHomeService homeService;
    private IMineInter mineInter;

    public IHomeService getHomeService() {
        return homeService;
    }

    public void setHomeService(IHomeService homeService) {
        this.homeService = homeService;
    }

    public IMineInter getMineInter() {
        return mineInter;
    }

    public void setMineInter(IMineInter mineInter) {
        this.mineInter = mineInter;
    }
}
