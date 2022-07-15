package assignment1;

public class MyMobile {
	String str = "My Mobile Program";
	
	public void makeCall() {
		System.out.println("MakeCall");
	}
	
	public void sendMsg() {
		System.out.println("SendMsg");
	}

	private void payBills() {
		System.out.println("PayBills");
	}
	
	public static void main(String[] args) {
		MyMobile mobile = new MyMobile();
		System.out.println(mobile.str);
		mobile.makeCall();
		mobile.sendMsg();
		mobile.payBills();
	}
}
