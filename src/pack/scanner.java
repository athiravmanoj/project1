package pack;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("enter a first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum"+c);
	}

}
