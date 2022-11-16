package com.springboot.setterconstructorbean;

public class Product {

    private int productId;
    private String productName;

    private String proDescription;
    private int proPrice;

    // constructor based
    public Product(int productId, String productName){
        this.productId = productId;
        this.productName = productName;
    }

    // setter based
    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public void getProductDetails(){
        System.out.println("productId: "+ productId);
        System.out.println("productName: "+ productName);
        System.out.println("proDescription: "+ proDescription);
        System.out.println("proPrice: "+ proPrice);
    }
}
