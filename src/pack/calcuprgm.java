package pack;

import java.util.Scanner;

public class calcuprgm {

		public static void main(String[] args) {
			int choice;
			do
			{
			System.out.println("enter a first number");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("enter a second number");
			int b=sc.nextInt();
			
		
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			
			{
			case 1:System.out.println("add"+(a+b));
			break;
			case 2:System.out.println("sub"+(a-b));
			break;
			case 3:System.out.println("multi"+(a*b));
			break;
			case 4:System.out.println("div"+(a/b));
			break;
			default:System.out.println("invalid");
			}
			
			}while(choice>0 && choice<=4);
			

	}

}
