//How I Code by Kamal Hakim - 2018

package com.ovrdos.code;

public class Application {

    private static final String CONFIG_DATA = "CONFIGURATION DATA FOR LOADING APPLICATION.";
    private static final String CONFIG_OK = "CONFIG_OK";
    private static final String CONFIG_ERROR = "CONFIG_ERROR";
    private static final String APP_STARTED = " APP STARTED! ";
    private static final String APP_NOT_STARTED = " APP NOT STARTED! ";
    private static boolean applicationStarted = false;
    private static boolean configLoaded = false;


    public static void main(String args[])throws RuntimeException {
        String config = CONFIG_ERROR;
        if (args!=null) {
            if (!(args[0]).equalsIgnoreCase(CONFIG_OK)) {
                throw new RuntimeException(CONFIG_ERROR + APP_NOT_STARTED + config);
            }
        }
        //This part of the application runs the initial
        // application startup and loads configuration.
        if (startApplication()) {
            config = loadConfigurations();
        }

        System.out.println(APP_STARTED + config);
    }

    private static boolean startApplication() {
        applicationStarted = true;
        return applicationStarted;
    }

    private static String loadConfigurations() {
        String configurationData = CONFIG_DATA;
        configLoaded = true;
        return configurationData;
    }

}