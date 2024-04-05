package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String args[]) {
    	Queue<String> queue = new PriorityQueue <>();
    	queue.add("Jasmin");
        queue.offer("Lotus");
        queue.offer("Rose");
        queue.offer("Mogara");
        queue.offer("Lilly");

      System.out.println("Queue: "+queue);
      System.out.println("head of queue:"+queue.element());
      System.out.println("removing element: "+queue.remove());
      System.out.println("After Removing Queue: "+queue);
      System.out.println("removing element: "+queue.poll());
      System.out.println("After Removing Queue: "+queue);
    
    
    
    }

	
	
	
}
