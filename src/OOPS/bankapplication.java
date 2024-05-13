package OOPS;

import java.util.Scanner;


interface bank

{
	public void accountdetails();
	public void deposit();
	public void balance();
	public void withdraw();
}
interface bank1
{
	public void details();
}
class banks implements bank
{	
Scanner sc=new Scanner(System.in);
int balance=0;
int deposit=0;
int withdraw=0;
int choice;

	@Override
	public void accountdetails() {
	
		System.out.println("bank name");
		String name=sc.next();
		System.out.println("account number");
		int accountnumber=sc.nextInt();
		System.out.println("IFSC code");
		String code=sc.next();
		System.out.println("your account details");
		System.out.println(name);
		System.out.println(accountnumber);
		System.out.println(code);
	}

	

	@Override
	public void deposit() {
		System.out.println("deposit");
		int deposit=sc.nextInt();
		balance=balance +deposit;
		System.out.println("deposit suucessfully"+deposit);
		
		
	}
	@Override
	public void balance() {
		
		System.out.println("balance amount "+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		int withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("withdrawal suucessfully");
		if (balance<100)
		{
		System.out.println("insufficient balance "+balance);
		
		}else 
		{
			System.out.println("balance "+balance);
		
	}
	}
}
public class bankapplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		banks ob=new banks();
		int choice;
		System.out.println("enter your choice");
		System.out.println("1:accountdetails");
		System.out.println("2:deposit");
		System.out.println("3.balance");
		System.out.println("4:withdraw");
		 choice =sc.nextInt();
		 switch (choice)
		 {
		 case 1:System.out.println("accountdetails");
		 ob.accountdetails();
		 break;
		 case 2:System.out.println("deposit");
		 ob.deposit();
		 break;
		 case 3:System.out.println("balance");
		 ob.balance();
		 case 4:System.out.println("withdraw");
		 ob.withdraw();
		 default:System.out.println("invalid");
		 }
				 
	
	}

}
