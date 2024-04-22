
package com.mycompany.project;


public class ClothingProduct extends Product{
    private String size ;
    private String fabric ;

    public ClothingProduct() {
    }

    public ClothingProduct(String size, String fabric, int ProductId, String name, float price) {
        super(ProductId, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public String getSize() {
        return size;
    }
    
    
}
