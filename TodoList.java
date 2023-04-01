/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TodoList {
    public static void main(String[] args) {
       /** Todo myNewTodo = new Todo(new Scanner(System.in).nextLine());
        System.out.println("what am i to do today ?" + myNewTodo.getDescription());
        System.out.println("1st todo entered on " + Todo.todoDate);
        
        Todo myOtherTodo = new Todo(new Scanner(System.in).nextLine());
        System.out.println("what am i to do today ?" + myOtherTodo.getDescription());
        System.out.println("2nd todo entered on " + Todo.todoDate);**/
       Scanner input = new Scanner(System.in);
       
       /**int age = 19;
       
       System.out.println("what dah fuck are u");
        String entity = input.next();
       
       String voterEligibility;
        voterEligibility = entity.equals("human") ? age >= 18 ? "eligible" : "not eligible" : "FUCK OFF BOT";
        System.out.println(voterEligibility);**/
    
                System.out.println("my money is " + giveMoney("amara",0));
       } 
public static int giveMoney(String name,int money){
       int giveMoney = name.equals("amara") ? 3000 : money;
       return giveMoney;
}

}



class Todo
{
    static Date todoDate = new Date();
    
    private final String description;
    
    public Todo(String desc)
    {
        description = desc;
    }
    public String getDescription() 
            {
                return description;
            }
}
