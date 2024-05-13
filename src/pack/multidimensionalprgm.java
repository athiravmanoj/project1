package pack;
import java.util.Scanner;

public class multidimensionalprgm {

	public static void main(String[] args) {
		int ar[][]=new int[4][3];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
/*       for(int i=0;i<4;i++)
		{
		for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
	}
*/
       
       for(int v[]:ar)
       {
    	   for(int v1:v)
    	   {
    		   System.out.print(v1+" ");
    	   }
    	   System.out.println();
       }
}
}
