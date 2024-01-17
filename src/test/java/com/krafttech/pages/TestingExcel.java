package com.krafttech.pages;

import com.krafttech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestingExcel {
    public static void main(String[] args) {
        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT-_DDF_test.xlsx","QA 1");
        List<Map<String, String>> dataList = excelUtil.getDataList();
        System.out.println("dataList = " + dataList);
        System.out.println("dataList.get(1).get(\"name\") = " + dataList.get(1).get("name"));
        System.out.println("dataList.get(3).get(\"password\") = " + dataList.get(3).get("password"));
        System.out.println("dataList.get(4).get(\"name\") = " + dataList.get(4).get("name"));
        System.out.println("dataList.get(3).get(\"job\") = " + dataList.get(3).get("job"));
    }
}
