package com.example;

import org.testng.Assert;
import org.testng.annotations.*;

public class ProductProductPriceServiceTest {

    private Product book;
    private ProductPriceService priceService;


    @BeforeMethod
    public void beforeMethod(){
        book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("The Witcher");
        priceService = new ProductPriceService(book);


    }
    @AfterMethod
    public void afterMethod(){
        // clean data
        book = null;
        priceService = null;
        System.out.println("After");
    }


    @Test
    public  void discountShouldBeCalculate(){
        priceService.calculateDiscount();
        System.out.println(book);
        Assert.assertEquals(book.getDiscount(), 27.5, "Wrong discount calculating");


    }

    @Test
    public  void hasDiscountShouldBe(){
        Product book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("The Witcher");
        System.out.println(book);
        ProductPriceService productPriceService = new ProductPriceService(book);
        productPriceService.calculateDiscount();
        System.out.println(book);
        Assert.assertTrue(book.isHasDiscount(), "Product should have discount");

    }


}
