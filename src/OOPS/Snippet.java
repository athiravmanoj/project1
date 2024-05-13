package OOPS;

public class Snippet {
	int select;
	System.out.println("cats types");
	System.out.println("------------"); 
	System.out.println("1:persian cat");
	System.out.println("2:abyssinian cat");
	System.out.println("3:american short hair");
	select =sc.nextInt();
	switch(select)
	{
	case 1:System.out.println("1:persian cat");
	       System.out.println("---------------"); 
		   System.out.println("size: medium to large");
	       System.out.println("coat:long,thick,glossy");
	       System.out.println("color:black,white,blue");
	       System.out.println("price:17700");
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

