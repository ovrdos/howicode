//How I Code by Kamal Hakim - 2018

package com.ovrdos.code;

public class Application {

    private static final String CONFIG_DATA = "CONFIGURATION DATA FOR LOADING APPLICATION.";
    private static boolean applicationStarted = false;
    private static boolean configLoaded = false;


    public static void main(String arg[]) {
        String config = "CONFIG_ERROR";
        //This part of the application runs the initial
        // application startup and loads configuration.
        if (startApplication()) {
            config = loadConfigurations();
        }

        System.out.println("APP STARTED! - " + config);
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