package com.sel.pageObjects;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pojo.Shoe;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class MonthShoesPage extends HomePage {

    List<Map> expectedShoeList = new ArrayList<>();

    public void clickMonth(String month) {

        WebElement element = driver.findElement(By.partialLinkText("" + month + ""));
        element.click();

    }

    public void retrieveMonthShoesCount(String month, String count) {

        WebElement shoeListEle = driver.findElement(By.xpath("//ul[@id='shoe_list']"));

        int rows = shoeListEle.findElements(By.tagName("li")).size();
        //verify data for all the months->
        System.out.println("verifying the ShoeCount for month: " + month);
        Assert.assertEquals(Integer.parseInt(count), rows);

    }

    public void retrieveMonthShoesValues(String month) {
        WebElement shoeListEle = driver.findElement(By.xpath("//ul[@id='shoe_list']"));


        List<WebElement> list_rows = shoeListEle.findElements(By.tagName("tr"));
        List<WebElement> list_clms;
        int i_row_count = list_rows.size();
        LinkedHashMap<String, String> o_clm_data = new LinkedHashMap<String, String>();
        int i_clm_count;// = list_clms.size();
        for (int i = 0; i < i_row_count; i++) {

                list_clms = list_rows.get(i).findElements(By.tagName("td"));
                i_clm_count = list_clms.size();
                if (i_clm_count == 2) {
                    if (!list_clms.get(0).getText().isEmpty() && !list_clms.get(0).getText().contains("Release"))
                        o_clm_data.put(list_clms.get(0).getText(), list_clms.get(1).getText());

                }//End Inner For
            expectedShoeList.add(o_clm_data);
        }

    }//

    public void verifyAllShoeData() throws IOException {
        InputStream inputStream = Resources.getResource("ShoeDetails.json").openStream();
        String json = null;
        try {
            json = IOUtils.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Type listType = new TypeToken<ArrayList<Shoe>>() {
        }.getType();
        List<Shoe> shoeList = new Gson().fromJson(json, listType);

        //Assert.assertEquals(expectedShoeList, shoeList);

    }


}
