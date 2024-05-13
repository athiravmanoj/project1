package OOPS;

public class prgm4 {

	public static void main(String[] args) {
		int rev=0,r;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				r=j;
				while(r>0)
				{
					j=i%10;
					r=r*10+j;
					i=i/10;
					
			}
	System.out.println();
	
	}
	}
}
