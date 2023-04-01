/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class calculator {
    public static void main(String[] args) {
        try {
              Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
        Addition.add(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("This is not an Integer pls run again then input an integer");
        }
    }
}

class Addition{
  static void add(int num1,int num2){
      
      int result = num1 + num2;
      System.out.println(result);
  }   
}