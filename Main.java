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
		
		System.out.println("The unsorted heap: ");
		heap.printHeap();
		System.out.println();
		
		System.out.println("Starting root is: ");
		System.out.println(heap.peek()); // it prints out 80 as the root for maxHeap.
		System.out.println();
		heap.heapSort();
		
		System.out.println("The sorted heap: ");
		heap.printHeap();
		
		
	}
}


