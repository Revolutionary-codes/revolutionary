/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class ReturnType 
{    
   Scanner input = new Scanner(System.in);
   
    public String name(String PersonName) 
    {
        return PersonName;
    }
    public Integer Addition()
     {
        int num1 = 300;
         int num2 = 400;
        int result = num1 + num2;
         return result;
         
     }

    public static void main(String[] args) 
    {
        ReturnType RT = new ReturnType();
        System.out.println(RT.name("AMARACHUKWU"));
        System.out.println(RT.Addition()); 
    }
}
