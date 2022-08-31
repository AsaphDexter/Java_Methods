package methods;
/**
 *
 * @author AsaphDexter
 */
public class Real_life_overriding {  
public static void main(String[] args){  
Strawberry a = new Strawberry();  
Coco b = new Coco();  
Vanilla c = new Vanilla();  

System.out.println("Strawberry Rate of Interest: "+ a.getRateOfInterest());  
System.out.println("Coco Rate of Interest: " + b.getRateOfInterest());  
System.out.println("Vanilla Rate of Interest: " + c.getRateOfInterest());  
}  
}  