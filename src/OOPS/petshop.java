package OOPS;

import java.util.Scanner;

interface shop
{
	
	public void cats();
	public void dogs();
}
class types implements shop
{

	@Override
	public void cats() {
		
		
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}
	
}
class pets implements shop
{    
	Scanner sc=new Scanner(System.in);
    
	@Override
	public void cats() {
		
		System.out.println("cats types");
		String name=sc.next();
		System.out.println("------------"); 
		System.out.println("1:persian cat");
		String type1=sc.next();
		System.out.println("2:abyssinian cat");
		String type2=sc.next();
		System.out.println("3:american short hair");
		String type3=sc.next();
		
		
	}

	@Override
	public void dogs() {
		
		
	}

	
	

	

	
	
	
	
	
	
}
public class petshop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		types ob=new types();
		int choice;
		System.out.println("enter your choice");
		System.out.println("1:cats");
		System.out.println("2:dogs");
		choice =sc.nextInt();
		switch(choice)
		{
		 case 1:System.out.println("cats");
		 ob.cats();
		 break;
		 case 2:System.out.println("dogs");
		 ob.dogs();
		 default:System.out.println("invalid");
		}
		
		int select;
		select =sc.nextInt();
		switch(select)
		{
		case 1:System.out.println("1:persian cat");
		       System.out.println("---------------"); 
			   System.out.println("size: medium to large");
		       System.out.println("coat:long,thick,glossy");
		       System.out.println("color:black,white,blue");
		       System.out.println("price:177000");
		       ob.cats();
		       break;
		case 2:System.out.println("2:abyssinian cat");
		       System.out.println("---------------");
			   System.out.println("size: medium to large");
	           System.out.println("coat:long,thick,glossy");
	           System.out.println("color:black,white,blue");
	           System.out.println("price:19000");
	           ob.cats();
	       break;
		case 3:System.out.println("3:american short hair");
		       System.out.println("---------------");
			   System.out.println("size: medium to large");
	           System.out.println("coat:long,thick,glossy");
	           System.out.println("color:black,white,blue");
	           System.out.println("price:12000");
	           ob.cats();
	       break;
	     default:System.out.println("invalid");
	    
		}
		
	}

	}
