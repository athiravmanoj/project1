package pack;

public class stringprgms {

	public static void main(String[] args) {

		String s="hello";
		String s1="luminar";
		
		//concat
		
		System.out.println(s.concat(s1));
		System.out.println(3+5+s+6+9);
		
		//equals
		String s2="hello";
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		//equalsignorecase
		String s3="Hello";
		System.out.println(s.equalsIgnoreCase(s3));
		
		//contains
		System.out.println(s1.contains("luminar"));
		
		//startswith && endswith
		String s4="hello i am athira";
		System.out.println(s4.startsWith("hello"));
		
		System.out.println(s4.endsWith("athira"));
		
		//touppercase  && tolowercase
		
		String s5="welcome to my world";
		System.out.println(s5.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		//trim
		
		String s6=" hai   ";
		System.out.println(s6.trim());
		
		//length
		
	    String s7="welcome";
	    System.out.println(s7.length());
	
	    //charat
	    
	    String s8="hi";
	    System.out.println(s8.charAt(1));
	    
	    //substring
	    
	    String s9="athira";
	    System.out.println(s9.substring(0,4));
	    
	    //split
	    String s11="gfvbh gvhjk ygyuj";
	    String[] str=s11.split(" ");
	    for(String v:str)
	    {
	    	System.out.println(v);
	    }
	    
	    // replace
	    String s10="hi";
	    System.out.println(s10.replace("hi","hlo"));
	    
	    //tochararray
	    char[] ch=s1.toCharArray();
	    for(char c:ch)
	    {System.out.println(c);
	    }
	    }
	    
	    }
	


