package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque =new  ArrayDeque<>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Pizza");
		deque.offer("Burger");
		deque.offer("Chole puri");
		deque.offer("Sandwitch");
		//deqeue.offer(null);
		
		System.out.println("Deque: "+deque);
		System.out.println("Removing 1st Element: "+deque.pollFirst());
		System.out.println("Deque: "+deque);
		System.out.println("Removing Last Element: "+deque.pollLast());
		System.out.println("Deque: "+deque);
		System.out.println("head of queue: "+deque.peek());
		
		
	}

}
