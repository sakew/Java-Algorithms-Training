import java.util.PriorityQueue;

import Trees.Heap;

public class Main {

	public static void main(String[] args) {
			
		Heap heap = new Heap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		System.out.println(heap.peek()); // it prints out 80 as the root for maxHeap.
		
//		example of minHeap using Priority Queue from the java jdk
//		NOTE: minHeap starts with the smallest value as the root and goes into an ascending order making
//		the highest number in the array as the last leaf or on the lowest level. 
//		maxHeap starts with the largest value as the root and goes into a descending order making the 
//		lowest number in the array as the last leaf or on the lowest level of the tree.
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-3492);
		pq.add(429);
		
		

//		System.out.println(pq.peek()); // it prints out -3492 as the root of the minHeap.

//		System.out.println(pq.remove()); // it removes -3492 and swaps the root with

//										//	-22 making it the new root with the highest priority.

//		System.out.println(pq.peek());

//		System.out.println(pq.poll()); // returns the element of from the head of the queue (front) and

//									   // removes it.

//		System.out.println(pq.peek()); // prints 0 as the new root.

//		System.out.println(pq.remove(54)); // it returns a boolean value if the item is found and removed.

//		System.out.println(pq.peek());
		
		pq.add(-1); // checking for errors: inserting a new "smallest value" will set
					// a new root to the minHeap.
		System.out.println(pq.peek());
		
		System.out.println("Printing the priority queue: ");
		
		Object[] integers = pq.toArray();
		for (Object number : integers) {
			System.out.print(number + ", ");
		}
		
	}			
}



