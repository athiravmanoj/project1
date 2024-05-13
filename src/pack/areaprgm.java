package pack;

public class areaprgm {

	public static void main(String[] args) {
		areaprgm ob=new areaprgm();
		 ob.ar();
		 ob.are(2,2);
		 int b=ob.area();
		 System.out.println("area "+b);
		 double p=ob.areas(10.0,2.5);
		 System.out.println("areas "+p);
		
		

	}
	
	
	//method without parameter and without returntype
	public void ar()
	{
		int r=2;
		double a=3.14*r*r;
		System.out.println(a);
	}
	
	
	//method with parameter and without returntype
public void are(int b,int h)
{
double c=0.5*b*h;
System.out.println(c);
}

//method without parameter and with returntype
public int area()
{
	int a=2;
	int m=a*a;
	return m;
}
//method with parameter and with returntype
public double areas(double l,double b)
{
double p =l*b;
return p;
}
}


