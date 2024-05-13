package OOPS;

interface workshop
{
	public void color();
	public void type();
}

interface vechicleworkshop
{
	public void workshopdetails();
}

class scooter implements workshop
{

	@Override
	public void color() 
		{
			System.out.println("scooter color");
		}
		
	

	@Override
	public void type() 
		{
			System.out.println("scooter type");
		}
		
	}
class cycle implements workshop
{

	@Override
	public void color() {
		System.out.println("car color");
		
	}

	@Override
	public void type() {
		System.out.println("car type");
		
	}	
	
	
	
}



public class interfaceprgm {

	public static void main(String[] args) {
		scooter ob=new scooter();
		ob.color();
		ob.type();
		cycle obj=new cycle();
		obj.color();
		obj.type();
		

	}

}
