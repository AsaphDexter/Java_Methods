package java_method_exercises;

import java.util.Scanner;

/**
 *
 * @author AsaphDexter
 * 10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

Expected Output:

Input a year: 2017                                                                        
false
 */
public class JME_10 {
    public static void main(String[] args) {
     int input;

     Scanner myObj = new Scanner(System.in);
     
     System.out.println("Input a year: ");
     input = myObj.nextInt();
     
     //Logic
     
if (((input % 4 == 0) && (input % 100 != 0)) || (input % 400 == 0)) 
      System.out.println("true");
else
     System.out.println("false");
    }
    }
