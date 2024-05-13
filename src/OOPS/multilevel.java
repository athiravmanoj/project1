package OOPS;

class parent1
{
	public void job()
	{
		System.out.println("job details");
	}
}
class child1 extends parent1
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}

class grandparent extends child1 
{
	public void grandparent()
	{
		System.out.println("grandparent details");
	}
}



public class multilevel {

	public static void main(String[] args) {
		grandparent ob =new grandparent();
	    ob.childmethod();
	    ob.job();
	    ob.grandparent();
	   
	   

	}

}
