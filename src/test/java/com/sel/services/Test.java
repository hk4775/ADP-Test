//package com.sel.services;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/test/resources/chromedriver");
////        String dropdownsURl= "https://rahulshettyacademy.com/dropdownsPractise";
//        WebDriver driver = new ChromeDriver();
////        driver.get(dropdownsURl);
////        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
////
////        Select drop = new Select(staticDropdown);
////        drop.selectByVisibleText("AED");
//
//
//        //button[contains(text(),'Try it')]
//
//
//
//        //dynamic dropdowns
//        driver.get("http://demo.guru99.com/test/newtours/register.php");
//        driver.manage().window().maximize();
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,500)");
//
//        //Click on Country Dropdown
//
//        driver.findElement(By.name("country")).click();
//
//        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='country']//option"));
//        System.out.println(allOptions.size());
//
//        for(int i=0; i< allOptions.size()-1; i++){
//            if(allOptions.get(i).getText().contains("ARUBA")){
//                allOptions.get(i).click();
//                break;
//            }
//        }
//
//    }
//}
