import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		BankDetails bd=new BankDetails();
		bd.accOpen();
		bd.deposit();
		bd.withdraw();
		bd.check();
		
	}

}
class BankDetails{
	double total=0;
	double withdraw;
	double deposit;
	double check;
	int accNo;
	
	void accOpen() {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter any 4 digit number as your account number");
		accNo=sc.nextInt();
	}
	
	void deposit() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your amount to be deposited");
		deposit=sc.nextDouble();
		total=total+deposit;
		System.out.println("Total money in your account after deposition is: "+total);
	}
	void withdraw() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your amount to be withdraw");
		withdraw=sc.nextDouble();
		if(total>=withdraw) 
		{
			total=total-withdraw;
			System.out.println("Total money in your account after withdrawal is: "+total);
		}
		else {System.out.println("Insufficient balance");}
		
	}
	void check() {
		Scanner sc= new Scanner (System.in);
		if(accNo!=0) {
			System.out.println("You have total money in your account is: "+total);
			System.out.println("Have a nice day");
		}
	}

}