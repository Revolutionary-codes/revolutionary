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
public class Calculator
{
    public static void main(String[] args)
    {
        Multiply multi = new Multiply();
        Addition ad = new Addition();
        Division di = new Division();
        Subtract sub = new Subtract();
        
        System.out.println(multi.product(6,3));
        System.out.println(ad.add(34,12));
        System.out.println(di.Divide(144,12));
        System.out.println(sub.minus(134,23));
    }
         
}
class Multiply
{
   Integer product(int num1,int num2)
   {
      int result = num1 * num2;
      return result;
    } 
}
class Addition
{
  Integer add(int num1,int num2)
  {
      int result = num1 + num2;
      return result;
  }  
}
class Subtract
{
    Integer minus(int num1,int num2)
    {
        int result = num1 - num2;
        return result;
    }
}
class Division
{
    Integer Divide(int num1,int num2)
    {
        int result = num1 / num2;
        return result;
    }
}
