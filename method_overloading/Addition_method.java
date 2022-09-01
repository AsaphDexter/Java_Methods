package method_overloading;
/**
 *
 * @author AsaphDexter
 * In this example, we have created two overloaded methods, 
 * first sum method performs addition of two numbers and second sum method performs addition of three numbers.
 */
public class Addition_method {
  
  void sum(int a,int b){
      System.out.println(a+b);
  }  
  void sum(int a,int b,int c){
      System.out.println(a+b+c);
  }  
 
  public static void main(String args[]){  
  Addition_method myObj = new Addition_method();  
  myObj.sum(40,40,40);  
  myObj.sum(20,20);  
  
  }  
}  
