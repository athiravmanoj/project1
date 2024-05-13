package OOPS;

abstract class teacher
{
	abstract public void teachermethod();
	public void teaching()
	{
		System.out.println("teacher teach");
	}
}
class student extends teacher
{

	@Override
	public void teachermethod() {
		System.out.println("student");
		
		// TODO Auto-generated method stub
		
	}
	
}




public class abstractprgm {

	public static void main(String[] args) {
		student ob=new student();
		ob.teaching();
		

	}

}
