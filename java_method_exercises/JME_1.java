package java_method_exercises;
/**
 *
 * @author AsaphDexter
 * 1. Write a Java method to find the smallest number among three numbers. 
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */
import java.util.Scanner;
public class JME_1 {
    public static void main(String[] args) {
     int firstNumber;
     int secondNumber;
     int thirdNumber;
     int small;
     
     Scanner myObj = new Scanner(System.in);
     
     System.out.println("Input the first number: ");
     firstNumber = myObj.nextInt();
     
     System.out.println("Input the second number: ");
     secondNumber = myObj.nextInt();
     
     System.out.println("Input the third number: ");
     thirdNumber = myObj.nextInt();
     
     //Logic for smallest number
   
    if (firstNumber < secondNumber){
         if (thirdNumber < firstNumber){
             small = thirdNumber;
    } else {  
             small = firstNumber;
         }
    } else {
    if (secondNumber < thirdNumber){
             small = secondNumber;
    }else {
        small = thirdNumber;
        }
    }
         System.out.println("The smallest value is " + small);
    }
    
}
    



