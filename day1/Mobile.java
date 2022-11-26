package week1.day1;

public class Mobile {
	public void sendsms() {
		System.out.println("happy to learn java");
	
	}
	public void makecall() {
		System.out.println("calling my friend");
	}
	public static void main(String[]args) {
		Mobile action=new Mobile();
		action.sendsms();
		action.makecall();
		
	}
}
