/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditionalstatement;
import java.util.*;
/**
 *
 * @author USER
 */
public class ConditionalStatement {

    public static void main(String[] args) {
         Scanner me = new Scanner(System.in);
         System.out.println("Enter age");
         int age = me.nextInt();
         
         
         if (age > 18){
             System.out.println("Adult");
         }else {
             System.out.println("Not Adult");
             
          Scanner we = new Scanner(System.in);
         System.out.println("Enter number");
         int numberCheck = we.nextInt();
         
         if (numberCheck % 2 == 0){
                System.out.println("Even"); 
         }else {    
             System.out.println("Odd");
         }
         
         }
         
         Scanner num1 = new Scanner(System.in);
         System.out.println("Enter first number");
         int a = num1.nextInt();
         
         
         Scanner num2 = new Scanner(System.in);
         System.out.println("Enter second number");
         int b = num2.nextInt();
         
         if (a == b){
              System.out.println("Equal");
         }else {
             if (a > b){
                  System.out.println("a is greater");
             }else{
                  System.out.println("a is lesser");
             }
         }
        
         
                 
         Scanner nm1 = new Scanner(System.in);
         System.out.println("Enter first number");
         int ab = nm1.nextInt();
         
         
         Scanner nm2 = new Scanner(System.in);
         System.out.println("Enter second number");
         int ba = nm2.nextInt();
         
         if (ab == ba){
              System.out.println("Equal");
         }else if (a > b){
             
                  System.out.println("a is greater");
             }else{
                  System.out.println("a is lesser");
             }
         
         Scanner bt= new Scanner(System.in);
         System.out.println("Enter from any number between 1 to 3");
         int  button = bt.nextInt();
        // if(button == 1){
             //System.out.println("hello");
        // }else if (button == 2 ){
         //    System.out.println("Howfar");
       //  }else if (button == 3){ 
       //      System.out.println("I love you");
       //  }else{ 
        //     System.out.println("Ivalid Opton, Choose between 1 to 3");
      //   }
          
         System.out.println("USING THE SWITCH CONDITIONAL STATEMENT");
         
         switch(button){
             case 1: System.out.println("hello java");
             break;
             case 2: System.out.println("you are welcome");
             break;
             case 3: System.out.println("i'm here for you");
             break;
             default :System.out.println("INVALID OPTION, PLEASE CHOOSE BETWEEN 1 TO 3");
         }
         
         Scanner kennedy = new Scanner(System.in);
         System.out.println("Enter 1, 2 0r 3");
         int kd  = kennedy.nextInt();
         
         switch(kd) {
             case 1: System.out.println("Dont give up on yourself");
             break;
             
             case 2: System.out.println("Dont give up on yourself");
             break;
             case 3: System.out.println("You will be successful");
             break;
             default: System.out.println(" INVALID OPTION, TRY AGAIN AND CHOOSE BEWTEEN 1 TO 3");
    }
         
       
             
}
}
