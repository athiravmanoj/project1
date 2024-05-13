package pack;

import java.util.Scanner;

public class largestarrayprgm {

	public static void main(String[] args) {
		int[] a=new int[3];
		int b=0;
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		a[i]=sc.nextInt();	
		}
		for(int i=0;i<3;i++)
		{
		if(b<a[i])
		{
			b=a[i];
		}
		
	}
		System.out.println("largest"+b);

}
}
