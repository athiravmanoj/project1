package pack;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arithematic operation
		int a=10,b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
//assignment operators
		System.out.println("a+=b"+(a=a+b));
		System.out.println("a-=b"+(a=a-b));
		System.out.println("a*=b"+(a=a*b));
		System.out.println("a/=b"+(a=a/b));
		System.out.println("a%=b"+(a=a%b));
// Relational operator(answer: true or false)
		int r=10,o=50;
		System.out.println("r<o"+(r<o));
		System.out.println("r==o"+(r==o));
//logical operator
		
/*      A      B    A&&B    A||B    !A       !B
		0      0      0       0      1        1
		1      0      0       1      0        1
		0      1      0       1      1        0
		1      1      1       1      0        0       */
		String username="anu";
		String password="a123";
		System.out.println(username=="anu"&&password=="a123");
		System.out.println(username=="anu123"&&password=="a123");
//unary operator
/*		*post increment ++m
		*pre increment  --m 
		* decrement */
		int u=5;
		System.out.println(++u);
		
		System.out.println(u++); System.out.println(u);
		
		System.out.println(--u);
		
		System.out.println(u--); System.out.println(u);
		
		//ternary operator
		// variable=condition?"exp1":"exp2";
	int t1=50,t2=10;
	String t=t1>t2?"t1 is greater":"t2 is greater";
	System.out.println(t);
	
	
	
	
	
	
	}

}
