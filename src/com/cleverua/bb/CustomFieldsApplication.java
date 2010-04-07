package com.cleverua.bb;

import net.rim.device.api.ui.UiApplication;

public class CustomFieldsApplication extends UiApplication {
    private static CustomFieldsApplication application;
    private static CustomFieldsDemoScreen customFieldsDemoScreen; 
    
    public static CustomFieldsApplication getInstance() {
        return application;
    }
    
    public static void main(String[] args) {
        application = new CustomFieldsApplication();
        application.pushScreen(customFieldsDemoScreen);
        application.enterEventDispatcher();   
    }
    
    public static void exit() {
        System.exit(0);
    }
    
    private CustomFieldsApplication() {
        customFieldsDemoScreen = new CustomFieldsDemoScreen();
    }
}
