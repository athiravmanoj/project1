package OOPS;

public class examplepolymorphism {

	public static void main(String[] args) {
		examplepolymorphism ob=new examplepolymorphism();
		ob.sub(4.0, 2);
		ob.sub(2, 1.3);
		ob.sub(5, 2);
		ob.sub(3, 5, 2);

	}
	
public void sub(int a,int b)
{
	int c= a-b;
	System.out.println(c);
}

public void sub(double a,double b,double c)
{
	c=a-b;
	System.out.println(c);
}
public void sub(int a,double b)
{ 
    double c=a-b;
    System.out.println(c);
}

public void sub(double a,int b)
{
    double c=a-b;
    System.out.println(c);
}
}
