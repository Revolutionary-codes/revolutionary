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
public class constructor {
  
   
     
    public static void main(String[] args) {
        person perObj = new person();
        System.out.println(perObj.getName());
        person perOb = new person();
        System.out.println(perOb.getAge());
    }
}

class person{
    String name;
   Integer age;
    public person(){
        name = " by amara siyk";
          age = 17;
        System.out.print("new object created");
        
    }
    String getName(){
       return name;
   }
    Integer getAge(){
     return age;
    }
}