package OOPS;


class parent
{
	public void job()
	{
		System.out.println("job details");
	}
}
class child extends parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}


public class singlelevel {

	public static void main(String[] args) {
    child ob =new child();
    ob.childmethod();
    ob.job();
	}

}
