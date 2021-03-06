package Trees;

public class Heap {

//									RULES:	
	
	
//		A binary heap must be a complete tree	
	
//		to get the parent and the children for any slot in the array.
//		to get the parent -> parent = floor((i-1)/2)
//		to get leftChild -> (2 * i) + 1  --> 2 * current position in the array (iterator) + 1 (for left)
//		to get the rightChild -> (2 * i) + 2 --> 2 * current position in the array (iterator) + 2
//	(for right)
	
// 		INSERTION INTO HEAP:
	
// 		step 1: always add new items to the end of the array
//		step 2: convert the binary tree into a heap (also known as heapify process)
//			we do this by comparing the new item against its parent and swapping it 
//			if it's greater than the parent.
//		step 3: repeat until the desired outcome is reached.	
	
//		DELETION FROM HEAP:
	
//		step 1: choose a replacement value
//		step 2: take the rightmost value so that the tree remains complete
//		step 3: heapify the heap
//		step 4: if the replacement value is greater than the parent heapify above (same as insert
//			-> swap the replacement value with the parent)
//			if less heapify below (swap the replacement value with the larger of the two children).
//		NOTE: the replacement value will be the rightmost leaf from the lowest level.
	
	
	
	private int[] heap;
	private int size;
	
	public Heap(int capacity) {
		heap = new int[capacity];
	}
	
	public void insert(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
//		if the heap is not full then we put the new value at the first available spot.
		
		heap[size] = value;
		
		fixHeapAbove(size);
		size++;
		
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		return heap[0];
	}
	
	public int delete (int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is emtpy");
		}
		
		int parent = getParent(index);
		int deletedValue = heap[index];
		
		
		heap[index] = heap[size-1];
		
		if (index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		}
		else {
			fixHeapAbove(index);
		}
		
		size--;
		
		return deletedValue;
	}
	
	
//	Notes:
//	- the root has the largest value
//	- swap root with last element in the array
//	- heapify the tree excluding the last node.
//	- after heapifying the tree second largest element becomes the root.
//	- repeat the process until heap tree is sorted.

//	Implementation of HeapSort algorithm step by step:	

//	step 1: swap root with last index
//	step 2: heapify the tree ignoring the last node. 
//			- 	reduce the size of the array after each heapify
//			-	from and array of 8 elements we reduce it to 7 and repeat the process.

//	step 3: repeat step 1 and 2 until it is sorted.
	
	
	public void heapSort() {
		
//		taking the last index for the swap operation (swap with root)
		
		int lastHeapIndex = size - 1;		
		for (int i = 0; i < lastHeapIndex; i++) {

// 		store the largest value (root) in temporary variable.			
			int tmp = heap[0];
				
//		finding location of the last item in the heap.
			
			heap[0] = heap[lastHeapIndex - i];

	
//		store the last item in place of the root.
			
			heap[lastHeapIndex - i] = tmp;
			
// 		printing the last item for each operation on the array.			
			System.out.println("Current last item: " + tmp
					+ " Current root: " + heap[i]);
			System.out.println();
			
			
//		heapify the tree.
		fixHeapBelow(0, lastHeapIndex - i - 1);	
			
		
		
		}
	}
	
	
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		
//		while index greater than 0 ( which is the root ) and new value greater than the parent.		
		while (index > 0 && newValue > heap[getParent(index)]) {
			
//		swap the parent with the new value.			
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		
		heap[index] = newValue;
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		
		while(index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			
			if(leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				}
				else {
//				assigning the index of the child that has the greatest value to childToSwap variable -> 
//				if heap[leftChild] is greater than heap[rigthChild] assign leftChild to childToSwap else
//				assign rightChild to childToSwap.
					
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}
				if (heap[index] < heap[childToSwap]) {
					
//					basic swapping of two values.
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
					
			}
				else {
					break;
				}
				index = childToSwap;
		}
			else {
				break;
			}
	}
}
	
	public void printHeap() {
		for (int i = 0; i < size; i++) {
			System.out.print(heap[i]);
			System.out.print(", ");
		}
		System.out.println();
	}
	
	public boolean isFull() { return size == heap.length; }
	
	public int getParent(int index) { return (index - 1) / 2; }
	
	public boolean isEmpty() { return size == 0; }
	
	public int getChild(int index, boolean left) { return 2 * index + (left ? 1 : 2); }
	
	
}
