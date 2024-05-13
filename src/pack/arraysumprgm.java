package pack;

import java.util.Scanner;

public class arraysumprgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  numbers");
		int[] a=new int[2];
		int sum=0;
		for(int i=0;i<2;i++)
		{
			a[i]=sc.nextInt();
			sum=a[i]+sum;
			}
		System.out.println("sum of numbers "+sum);
		
	}

}
