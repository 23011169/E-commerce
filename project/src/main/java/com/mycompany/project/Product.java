 
package com.mycompany.project;


public class Product {
   protected  int ProductId ;
   protected String name;
   protected float price ;

    public Product() {
    }

    public Product(int ProductId, String name, float price) {
        
        this.ProductId = Math.abs(ProductId);
        this.name = name;
        this.price = Math.abs (price);
    }

    

    public void setProductId(int ProductId) {
        
        this.ProductId = Math.abs(ProductId);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public int getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    
    
}
