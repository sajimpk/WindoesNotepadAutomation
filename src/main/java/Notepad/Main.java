package Notepad;

import java.net.MalformedURLException;
import java.net.URL;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Main {


//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
//            capabilities.setCapability("platformName", "Windows");
//            capabilities.setCapability("deviceName", "WindowsPC");
//
//            // Connect to the running WinAppDriver instance
//           WindowsDriver<WindowsElement> driver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4722"),capabilities);
//            Thread.sleep(5000);
//            driver.quit();
//
//        }

    private WindowsDriver driver;


    @Before
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("deviceName", "WindowsPC");
        // Initialize AndroidDriver
        WindowsDriver driver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"),capabilities);
        this.driver =driver;
        // Perform some actions
        System.out.println("App launched successfully!");
    }
    @Test
    public void sampleTest() throws InterruptedException {
        System.out.println("App TEST Example successfully!");
        Thread.sleep(3000);
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("App Closed successfully!");
    }

}

