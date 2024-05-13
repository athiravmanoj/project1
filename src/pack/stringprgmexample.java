package pack;

public class stringprgmexample {

	public static void main(String[] args) {
		String s1="java is platform independent";
		if(s1.contains("platform"))
		{
		System.out.println("it contain platform");
		}
		else
		{System.out.println("it didnot contain platform");
			
		}
		
		String s2="jmeter is a performance testing tool";
String[] str=s2.split(" ");
for(String v:str)
{
	System.out.println(v);
}

String s3="amma";
 System.out.println(s3.length());
 int m=(s3.length())-1;
 if(m<0) 
 {
	 m--;
 }
 System.out.println(s3.charAt(m));

	}
}
	
