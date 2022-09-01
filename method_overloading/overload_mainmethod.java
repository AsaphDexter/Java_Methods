package method_overloading;
/**
 *
 * @author AsaphDexter
 * Can we overload main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
* Let's see the simple example:
 */
public class overload_mainmethod {
    public static void main(int a){  
  System.out.println(a);  
  }  
    
  public static void main(String[] args){  
  System.out.println("main() method invoked");  
  main(10);  
  }  
}
