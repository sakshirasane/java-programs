package multithreading;
class Customer{
	private int balance=10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs. "+amount);
		if(balance<amount) {
			System.out.println("less Balance. Waiting for Deposite......");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -=amount;
		System.out.println(" withdraw completed. Balance: "+balance);
	}
	synchronized void deposite(int amount) {
		System.out.println(" going to deposite Rs.: "+amount);
		balance +=amount;
		System.out.println(" deposite completes.balance: "+balance);
		notify();
	}

public class InterThreadcomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Customer cust= new Customer();
       new Thread("Raj") {
    	   public void run() {cust.withdraw(15000);};
       }.start();
       new Thread("Riya") {
    	   public void run() {cust.deposite(20000);};
       }.start();
	}

}
}
