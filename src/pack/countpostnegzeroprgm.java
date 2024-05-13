package pack;

import java.util.Scanner;

public class countpostnegzeroprgm {

	public static void main(String[] args) {
		
		int z=0,p=0,n=0;
		int[] a=new int[4];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
		if(a[i]==0)
		{
		z++;	
		}
		else if(a[i]<0)
		{
		n++;
		}
		else
		{
		p++;
		}
		
}
		System.out.println("zero"+z);
		System.out.println("positive"+p);
		System.out.println("negative"+n);
		
}
}


