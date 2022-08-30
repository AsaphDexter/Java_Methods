package java_method_exercises;
/**
 *
 * @author AsaphDexter
 * 
 * 2. Write a Java method to compute the average of three numbers. 
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */
import java.util.Scanner;
public class JME_2 {
    public static void main(String[] args) {
     int firstNumber;
     int secondNumber;
     int thirdNumber;
     int average;

     Scanner myObj = new Scanner(System.in);
     
     System.out.println("Input the first number: ");
     firstNumber = myObj.nextInt();
     
     System.out.println("Input the second number: ");
     secondNumber = myObj.nextInt();
     
     System.out.println("Input the third number: ");
     thirdNumber = myObj.nextInt();
     
     //Logic for fing average of numbers 
      
    average = ((firstNumber + secondNumber + thirdNumber) / 3);
    double newAverge = average; // Automatic casting: int to double
    
    //Output
    System.out.println("The average value is " + newAverge);

}
    
}
