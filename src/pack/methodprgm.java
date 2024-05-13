package pack;

public class methodprgm {

	public static void main(String[] args) {
	methodprgm ob=new methodprgm();
	ob.add();
	ob.sub(10, 5);
	int c=ob.mul();
			System.out.println("mul ="+c);
			double d=ob.div(2.3,10.0);
			System.out.println("div ="+d);
	}
	
	
	//method without parameter and without returntype
	public void add()
	{
	int a=1,b=3;
	int c=a+b;
	System.out.println("add ="+c);
	}

	//method with parameter and without returntype
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub ="+c);
	}
	
	//method without parameter and with returntype
	public int mul()
	{
	
		int a=2,b=1;
		int c=a*b;
		return c;
	}
	//method with parameter and with returntype
	public double div(double a,double b)
	{
	double d=a/b;
	return d;
	}
	}
	

