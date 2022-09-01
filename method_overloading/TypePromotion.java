package method_overloading;
/**
 *
 * @author AsaphDexter
 * byte can be promoted to short, int, long, float or double. 
 * The short datatype can be promoted to int,long,float or double. The char datatype can be promoted to int,long,float or double and so on.
 */
public class TypePromotion {
    void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  TypePromotion myObj = new TypePromotion();  
  myObj.sum(40,40);//now second int literal will be promoted to long  
  myObj.sum(40,40,40);  
  
  }  
}
//If there are matching type arguments in the method, type promotion is not performed.s
//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.