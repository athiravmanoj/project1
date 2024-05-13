package pack;

public class palinprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1111;
int m=1111,j,k=0;
while(i>0)
{
	j=i%10;
	k=k*10+j;
	i=i/10;
	
	}System.out.println(k);
	if(m==k)
{System.out.println("palin");
}
	else
	{System.out.println("not palin");
	}
}
	}
	


