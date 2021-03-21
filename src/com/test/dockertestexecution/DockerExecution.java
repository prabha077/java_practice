package com.test.dockertestexecution;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.concurrent.TimeUnit;

public class DockerExecution {


    @Test
    public void localtest() throws MalformedURLException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.get("https://google.co.in");
        System.out.println("Title is" + driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(35, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void localtest1() throws MalformedURLException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.FIREFOX);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);
        driver.get("https://google.co.in");
        System.out.println("Title is" + driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(35, TimeUnit.SECONDS);
        driver.quit();
    }
}
