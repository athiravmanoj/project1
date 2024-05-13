package OOPS;
class animal
{
	public void animalmethod()
	{
		System.out.println("animal details");
	}
}

class monkey extends animal
{
	public void monkeymethod()
	{
		System.out.println("monkey details");
	}
}


class donkey extends animal
{
	public void donkeymethod()
	{
		System.out.println("donkey details");
	}
}
public class hierarchial {

	public static void main(String[] args) {
		monkey ob = new monkey();
		ob.animalmethod();
		ob.monkeymethod();
		donkey obj = new donkey();
		ob.animalmethod();
		obj.donkeymethod();

	}

}
