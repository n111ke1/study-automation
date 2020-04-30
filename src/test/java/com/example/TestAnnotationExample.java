package com.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationExample {

    @Test(enabled = false)
    public void  disabledTest(){
        System.out.println("disabledTest");
    }

    @Test(description = "my Test")
    public void  testWithDescription(){
        System.out.println("descript test");
    }


}
