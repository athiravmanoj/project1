package pack;

import java.util.Scanner;

public class vowelcountprgm {

	public static void main(String[] args) {
		//method with parameter and return type
		//vowel count prgm
		
		//vowelcountprgm ob=new vowelcountprgm();
		//double d=ob.vowel(d);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String n=sc.next();
		n.toLowerCase();
		int count=vowel(n);
		System.out.println("vowel count"+count);
		
	}
	public static int vowel(String n)
	{int c=0;
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
			{
				c++;
			}
		}
	return c;		
	
	}
	
	}

	
	

