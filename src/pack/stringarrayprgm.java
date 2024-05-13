package pack;

import java.util.Scanner;

public class stringarrayprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("entered string=");
		for(int i=0;i<n;i++)
		{System.out.println(a[i]);
		}
		}
		}
		

	


