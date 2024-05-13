package ctrlprgm;

public class calculator {

	public static void main(String[] args) {
		int a=1,b=6;
		int ch;
		ch=4;
		switch(ch)
		
		{
		case 1:System.out.println("add"+(a+b));
		break;
		case 2:System.out.println("sub"+(a-b));
		break;
		case 3:System.out.println("multi"+(a*b));
		break;
		case 4:System.out.println("div"+(a/b));
		break;
		default:System.out.println("invalid");
		}

	}

}
