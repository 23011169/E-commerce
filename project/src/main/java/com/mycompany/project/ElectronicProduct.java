
package com.mycompany.project;


public class ElectronicProduct extends Product{
   private String brand ;
    private int WarrantyPeriod ;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int WarrantyPeriod, int ProductId, String name, float price) {
        super(ProductId, name, price);
        this.brand = brand;
        this.WarrantyPeriod = Math.abs(WarrantyPeriod);
    }

    public void setWarrantyPeriod(int WarrantyPeriod) {
        this.WarrantyPeriod = Math.abs(WarrantyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }
    
}
