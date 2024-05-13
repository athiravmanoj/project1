package OOPS;

import java.util.Scanner;

interface tvremote1
{
	public void volumebutton();
	public void poweroffbutton();
	public void channelbutton();
	
}
interface smarttvremote extends tvremote1
{
	public void bluetooth();
}

class tv implements smarttvremote
{

	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
		
	}

	@Override
	public void volumebutton() {
		System.out.println("volumebutton");
		
	}

	@Override
	public void poweroffbutton() {
		System.out.println("poweroffbutton");
		
	}

	@Override
	public void channelbutton() {
		System.out.println("channelbutton");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public class tvremote {
	public static void main(String[] args) {
	 tv ob=new tv();
ob.bluetooth();
ob.channelbutton();
	}

}
