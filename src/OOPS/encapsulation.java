package OOPS;
class emp
{
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		emp ob=new emp();
		ob.setEmpid(105);
		ob.setEmpname("athira");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());

	}

}
