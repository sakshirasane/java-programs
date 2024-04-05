package multithreading;

public class multithreading {
class PrintTable{
	
	public void print(int n) {
		synchronized (this) {
			for(int i=0;i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println(i*n);
			}
			
		}
	}
}

class Thread1 extends Thread{
	PrintTable printTable;
	
	public Thread1(PrintTable printTable) {
		this.printTable=printTable;
	}
	public void run() {
		printTable.print(5);
	
	}
	
}
class Thread2 extends Thread{
	PrintTable printTable;
	
	public Thread2(PrintTable printTable) {
		this.printTable=printTable;
	}
	public void run() {
		printTable.print(4);
	
	}
	
}
public class SynchronizedBlockEx{
	public static void main(String args[]) {
		PrintTable printTable=new PrintTable();
		Thread1 thread1= new Thread1(printTable);
		Thread2 thread2= new Thread1(printTable);
        thread1.start();
        thread2.start();
	
	}
}
}
