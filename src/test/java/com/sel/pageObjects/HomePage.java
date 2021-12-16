package com.sel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class HomePage {

    WebDriver driver;
        public HomePage() {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/test/resources/chromedriver");
            String baseUrl = "https://shoe-store-july.herokuapp.com/";
            driver = new ChromeDriver();
            driver.get(baseUrl);
            PageFactory.initElements(driver, this);

        }

        public  void verifyAllMonths(){
            List<String> months = Arrays.asList(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October",
                    "November", "December"});
            months.forEach(m -> {
                Boolean isPresent =  driver.findElements(By.xpath("//a[contains(text(),"+m+" )]")).size()> 0;
                Assert.assertTrue(isPresent);
            });

        }

        public  void closeBrowser(){
            driver.close();
        }

}
