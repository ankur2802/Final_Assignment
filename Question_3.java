//import java.util.*;
//public class Question_3
//{
//    public static void main(String[] args)
//    {
//          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
// 
//          System.out.println("Enter Your Age");
// 
//          int age = sc.nextInt();         //Taking input from user
// 
//          try
//          {
//              if(age < 0)
//              {
//                  throw new MyException();    //throws an Exception if age is negative
//              }
//          }
//          catch(Exception ex)
//          {
//             // System.out.println(ex);     //Prints exception description
//          }
//    }
//}
//class MyException extends Exception{
//	
//	MyException(){
//		System.out.println("Negative number is not allowed");
//	}
//}



//Defining Our own exception by extending Exception class
import java.util.*; 
class NumIsNegativeException extends Exception
{
    String errorMessage;
 
    public NumIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}

public class Question_3
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new NumIsNegativeException("Age can not be negative");    //throws AgeIsNegativeException if age is negative
              }
          }
          catch(NumIsNegativeException ex)
          {
              System.out.println(ex);    //Output : Age can not be negative
          }
    }
}















