package com.krafttech.step_definitions;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before(order = 0)
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @After(order = 0)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        BrowserUtils.waitFor(3);
        Driver.closeDriver();
    }
    @Before(value = "@database", order = 1)
    public void openDataBase(){
        System.out.println("opening database...");
    }
    @After(value = "@database", order = 1)
    public void closeDataBase(){
        System.out.println("closing database...");
    }
}
