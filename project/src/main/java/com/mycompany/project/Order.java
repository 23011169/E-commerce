
package com.mycompany.project;



public class Order {
   private int customerId;
  private   int orderId;
  private float totalprice;
  private   Product []products;

    public Order(int customerId, int orderId, float totalprice, Product[] products) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.totalprice = totalprice;
        this.products = products;
    }

    
  
    public void printOrderInfo() {
        System.out.println("Here's your order's Summary:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total Price: $" + totalprice);
    }
    
}