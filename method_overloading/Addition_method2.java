package method_overloading;
/**
 *
 * @author AsaphDexter
 * 
 * Example of Method Overloading by changing data type of argument
In this example, we have created two overloaded methods that differs in data type. 
* The first sum method receives two integer arguments and second sum method receives two double arguments.
 * 
 */
public class Addition_method2 {
     
  void sum(int a,int b){
      System.out.println(a+b);
  }  
  void sum(double a,double b){
      System.out.println(a+b);
  }  
  
  public static void main(String args[]){  
  Addition_method2 myObj = new Addition_method2();  
  myObj.sum(40.5,40.5);  
  myObj.sum(20,20);  
  }    
}

/*Why Method Overloaing is not possible by changing the return type of method?
In java, method overloading is not possible by changing the return type of the method because there may occur ambiguity. Let's see how ambiguity may occur:

because there was problem:

  int result = myObj.sum(20,20); //Compile Time Error  
*/
