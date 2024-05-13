package OOPS;
class member 
{
	String name;
	int age;
	long phonenumber;
	int salary;
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phonenumber);
		System.out.println(salary);
	}
}
class employee extends member
{  String specification;

}
class manager extends member
{
	String department;
}
public class oopsprogram {

	public static void main(String[] args) {
		employee emp=new employee();
		emp.name="anu";
		emp.age=20;
		emp.phonenumber=998877665;
		emp.salary=20000;
System.out.println();
	}

}
