package OOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionprgm {

	public static void main(String[] args) throws FileNotFoundException {
		//file case (use throws)
		FileInputStream f=new FileInputStream("E://Booki.xslc");
		
		
		try {
		int a=5,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("hello");
			//System.out.println(e.getmessage());
		}

	}

}
