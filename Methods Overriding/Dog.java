package methods;
/**
 * @author AsaphDexter
 * Understanding the problem without method overriding
Let's understand the problem that we may face in the program if we don't use method overriding.
* 
* Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding.

Example of method overriding
In this example, we have defined the run method in the subclass as defined in the parent class but 
* it has some specific implementation. The name and parameter of the method is same and 
* there is IS-A relationship between the classes, so there is method overriding.
 */

public class Dog extends Animal {
   public static void main(String[] args){  
  Dog myObj = new Dog();  
  myObj.run();  
  }  
}

