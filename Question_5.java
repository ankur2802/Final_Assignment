//interface declaration
interface PolygonShape {
    void calculateArea(int len, int bre);
}
 
//implement the interface
class Square implements PolygonShape {
//implement the interface method
    public void calculateArea(int len, int bre) {
        System.out.println("The area of the square is " + (len * bre));
    }
}
// abstract declaration
abstract class Car{  
	   Car(){
		   System.out.println("car is created");
	   }  
	   abstract void run();  
	   void changeGear(){
		   System.out.println("gear changed");
		   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Tata extends Car{  
	 void run(){
		 System.out.println("running in good condition..");}  
	 }  
public class Question_5 {

	public static void main(String[] args) {
		Square rect = new Square();       
	        rect.calculateArea(50, 20);
	        
	        Tata t=new Tata();
	        t.run();
	        t.changeGear();

	}

}

/*ABSTRACT CLASS
Abstract class can have abstract and non-abstract methods.
It doesn't support multiple inheritance.
It can provide the implementation.
abstract keyword is used to declare abstract class.
Abstract class can have final, non-final, static and non-static variables
Abstract class can extend another Java class and implement multiple Java interfaces*/

/*INTERFACE
It can have only abstract methods.
It supports multiple inheritance.
It can't provide the implementation.
Interface keyword is used to declare interface.
Interface has only static and final variables.
Interface can extend another Java interface only.*/

