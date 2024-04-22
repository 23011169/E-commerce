
package com.mycompany.project;


public class Cart {
    private int customerId;
    private int nProducts;
    private Product []products;

    public Cart(int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = nProducts;
       this. products =new Product [nProducts];
    }

    public void setCustomerId(int customerId) {
        this.customerId =Math.abs (customerId);
    }

    public void setnProducts(int nProducts) {
        this.nProducts =Math.abs (nProducts);
      
    }

    public void setProducts(Product[] products) {
        this.products = products;
        
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getnProduct() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product ,int index) {
         if (index >= 0 && index < nProducts) {
            products[index] = product;
        } else {
            System.out.println("Invalid index");
        }
    }
    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            
              products[index]=null;
            
        } else {
            System.out.println("Invalid index Cannot remove product.");
        }
    }
    public float calculateprice(){
        float totalprice=0;
        for(int i=0;i<nProducts;i++){
               totalprice+=products[i].getPrice(); 
        }
        return totalprice;
    }
   public void placeOrder(int ch){
Order order = new Order(customerId,1,calculateprice(),products);
	switch(ch)
	 {
		case 1:
		order.printOrderInfo();
		break ;
		case 2:
		System.out.println("Thank you for your visiting ");
		break ; 
	 }
   
   }
    } 
    

    



   
    

