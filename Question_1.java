//import java.util.*;
interface Shape
{
	void input();
	void area();
}
class Circle implements Shape{
	int radius = 0;
    double pi = 3.14;
    double area = 0;
    
    public void input()
    {
        radius = 5;
    }
   
    public void area()
    {
        area = pi * radius * radius;
        System.out.println("Area of circle: "+area);
    }
}
class Rectangle extends Circle
{
    int len = 0;
    int br = 0;
    double area;
    public void input()
    {
       // super.input();
        len = 6;
        br = 4;
    }
    public void area()
    {
       // super.area();
        area = len * br;
        System.out.println("Area of rectangle: "+area);
    }
}

public class Question_1 {

	public static void main(String[] args) {
		 Rectangle obj = new Rectangle();
	        obj.input();
	        obj.area();
	        
	        Circle obj1=new Circle();
	        obj1.input();
	        obj1.area();

	}

}
