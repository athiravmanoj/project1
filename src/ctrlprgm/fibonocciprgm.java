package ctrlprgm;

import java.util.Scanner;

public class fibonocciprgm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3,n=10;
		for(int i=1;i<=n;i++)
		{
			n3=n2+n1;
			System.out.print(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
}

