package com.globalk.android.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by Dakalo on 19/01/2020.
 */

public class BaseSetup {

        private DesiredCapabilities capabilities = new DesiredCapabilities();
        private static AndroidDriver androidDriver = null;

        @BeforeClass
        public void setup(){
            initDriver();
        }

        public AndroidDriver getDriver() {
            return androidDriver;
        }

        private void initDriver(){
            System.out.println("Inside initDriver method");

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
            cap.setCapability(MobileCapabilityType.APP, "C://Users//MakotiNdhlovu//Documents//eclipse//android-ump-mobile-debug-67a35ff.apk");
            cap.setCapability("noReset", true);
            String serverUrl = "http://0.0.0.0:4723/wd/hub";


            try
            {
                System.out.println("Argument to driver object : " + serverUrl);
                androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);

            }
            catch (NullPointerException | MalformedURLException ex) {
                throw new RuntimeException("appium driver could not be initialised for device ");
            }
            System.out.println("Driver in initdriver is : "+androidDriver);

        }

        @AfterClass
        public void tearDown(){
            androidDriver.quit();
        }

    }