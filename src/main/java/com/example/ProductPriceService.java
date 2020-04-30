package com.example;

public class ProductPriceService {

    private Product product;

    public ProductPriceService(Product product) {
        this.product = product;
    }

    public void calculateDiscount(){
        double discount = this.product.getPrice()/2d;
        this.product.setDiscount(discount);
        this.product.isHasDiscount();
    }
}
