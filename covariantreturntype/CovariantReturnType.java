package covariantreturntype;
/**
 *
 * @author AsaphDexter
 * 
 * The covariant return type specifies that the return type may vary in the same direction as the subclass.
Before Java5, it was not possible to override any method by changing the return type. 
*But now, since Java5, it is possible to override method by changing the return type if subclass 
*overrides any method whose return type is Non-Primitive but it changes its return type to subclass type. 
*Let's take a simple example:
 * 
 */
public class CovariantReturnType {  
CovariantReturnType get(){
    return this;
}  
} 

class Sample extends CovariantReturnType{  
@Override
Sample get(){
    return this;
}  
void message(){
    System.out.println("welcome to covariant return type");
}  
 
  public static void main(String args[]){  
  new Sample().get().message();  
}  
}  
    
/*As you can see in the above example, the return type of the get() method of CovariantReturnType class is CovariantReturnType 
but the return type of the get() method of Sample class is Sample. Both methods have different return type 
but it is method overriding. This is known as covariant return type.*/