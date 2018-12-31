package com.kunal.selenium;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class SeleniumAutomationExample {

    public static void main(String[] args)throws Exception {


        //Opening WebBrowser using
        String webURL="https://www.google.com/";

        System.setProperty("webdriver.chrome.driver", "/home/kunal/chromedriver");
        WebDriver driver=new ChromeDriver();

      /*  System.setProperty("webdriver.gecko.driver", "/home/kunal/firefoxdriver/firefox/firefox-bin");
      WebDriver driver=new FirefoxDriver();*/

        driver.get(webURL);

        System.out.println(" Current URL "+driver.getCurrentUrl());
        System.out.println(" Page Title "+driver.getTitle());




        /*
         identify webelement using name and Entering value into text box
         */
        WebElement element=driver.findElement(By.name("q"));
      /*  element.sendKeys("kunal sharma symantec");
        Thread.sleep(1000);
        element.submit();


        /*
         click on link and identify element by class
         */
       /* element=driver.findElement(By.name("btnK"));
        element.click();
        Thread.sleep(1000);
       element=driver.findElement(By.className("gb_P"));
       element.click();
       Thread.sleep(1000);

       element=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        element.sendKeys("kunal sharma symantec");
        Thread.sleep(1000);
        element.submit();*/



       element=driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
        element.sendKeys("kunal sharma symantec");
        Thread.sleep(1000);
        element.submit();
        Thread.sleep(1000);

        driver.close();

    }
}
