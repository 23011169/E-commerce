

package com.mycompany.project;

import java.util.Scanner;
public class Project {

    public static void main(String[] args) {  
Scanner input=new Scanner(System.in);
ClothingProduct s1=new ClothingProduct("Medium","Cotton",2,"T-shirt", (float) 19.99);

BookProduct s2=new BookProduct("O'Reilly", "X Publisher", 3, "OOP", (float)39.99);
ElectronicProduct s3=new ElectronicProduct("Samsung", 1,1, "Smartphone", (float)599.99);
System.out.println("Welcome to the E-commerce System");
System.out.println("Please Enter your id");
int Id=input.nextInt();
System.out.println("Please Enter your name");
String name=input.next();
System.out.println("Please Enter your address");
String address=input.next();
Customer x=new Customer (Id,name,address);
System.out.println("How many Products you want to your cart?");
int nProducts =Math.abs(input.nextInt());

Cart s4=new Cart ( Id, nProducts);
for(int i=0;i<nProducts;i++){
    System.out.println("Which Products Would you like to add? 1-Smartphone 2-T-shirt 3-OOP");
    int choice=input.nextInt();
    switch (choice){
        case 1:
        s4.addProduct(s3,i);
        break;
        case 2:
            s4.addProduct(s1,i);
            break;
        case 3:
           s4.addProduct(s2,i);
        break;
    }      
}
        System.out.println("your total is $ "+s4.calculateprice()+"Would you want to place your order? 1- yes 2- No");
        int num = input.nextInt();
        s4.placeOrder(num) ;
        


    }
}
        
                