package com.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreviewProductServiceTest {


    private Product book;
    private ProductPriceService priceService;
    private PreviewProductService previewProductService;


    @BeforeMethod
    public void beforeMethod(){
        book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("The Witcher");
        priceService = new ProductPriceService(book);
        previewProductService = new PreviewProductService(book);


    }
    @AfterMethod
    public void afterMethod(){
        // clean data
        book = null;
        priceService = null;

    }



    @Test
    public void showTitleWithoutDiscount(){
        double discount =25.5;
        book.setHasDiscount(true);
        book.setDiscount(discount);
        Assert.assertEquals(previewProductService.showTitle(), book.getTitle() + " ("+discount+")");
    }

}
