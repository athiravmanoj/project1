package OOPS;
class parents
{
	public void job()
	{
		System.out.println("engineer");
	}
}
class son extends parents
{
	
	@Override
	public void job() {
		System.out.println("driver");
		super.job();
	}
}


public class oopsprgms {

	public static void main(String[] args) {
son ob=new son();		
 ob.job(); 
	}

}
