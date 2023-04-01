/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpackage;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ShoppingApp {

    public static void main(String[] args) {
        Cart cart = new Cart();
        
        System.out.print("Enter \n 1 to add Shoe to the cart \n 2 to add Bag to the cart\n 3 to add laptop to the cart\n 4 to add a phone to the cart\n");
        Scanner input = new Scanner(System.in);
        Integer choice = input.nextInt();
        switch (choice) {
            case 1:
                cart.addToCart(new Shoe("Fendi"));
                break;

            case 2:
                cart.addToCart(new Bag("gucci"));
                break;
            case 3:
                cart.addToCart(new Laptop("HP"));
                break;
            case 4:
                cart.addToCart(new Phone("REDMI"));
                break;
            default:
                System.out.println("Please choose a valid option.");
        }
    }
}

class Cart {

    public void addToCart(cartinterface gc) {
        System.out.println("You have added " + gc.getBrand());
        System.out.println("You have a discount of $" + gc.getDiscount());
    }
}

interface cartinterface {

    public String getBrand();
    public Integer getDiscount();
}

class Shoe implements cartinterface {
private String brand;
    private Integer price = 5000;

    public Shoe(String brandName) {
        this.brand = brandName;        
    }
    public Shoe(){
        
    }
    public String getBrand(){
        return brand + " shoe to the cart";
    }

    
    public Integer getDiscount() {
        return price * 4;
    }
   }

class Bag implements cartinterface {

    private String brand;
    private Integer price = 5000;

    public Bag(String brandName) {
        this.brand = brandName;
    }

        public String getBrand(){
        return brand + " bag to the cart";
    }

    public Integer getDiscount() {
        return price * 4;
    }

}
class Laptop implements cartinterface{
    
    private String brand;
    private Integer price = 5000;

    public Laptop(String brandName) {
        this.brand = brandName;
    }

        public String getBrand(){
        return brand + " laptop to the cart";
    }

    public Integer getDiscount() {
        return price * 4;
    }

}
class Phone implements cartinterface{
    
    private String brand;
    private Integer price = 5000;

    public Phone(String brandName) {
        this.brand = brandName;
    }

        public String getBrand(){
        return brand + " phone to the cart";
    }

    public Integer getDiscount() {
        return price * 4;
    }

}