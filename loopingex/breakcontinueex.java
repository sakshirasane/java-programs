package loopingex;

public class breakcontinueex {

	public static void main(String[] args) {
		int i;
		System.out.println("break example");
		for(i=1;i<=5;i++) {
			if(i==5)
				break;
		System.out.print(i+" ");
		}
		
		System.out.println("\ncontinue example");
		for(i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.println(i+" ");
		}

	}

}
