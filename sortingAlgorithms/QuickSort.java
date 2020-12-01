package sortingAlgorithms;

public class QuickSort {

	public void quickSortMethod(int[] input, int start, int end) {
		
		if ( end - start < 2 ) {
			return;
		}
		
		int pivotIndex = partition( input, start, end );
		
		quickSortMethod ( input, start, pivotIndex );
		quickSortMethod (input, pivotIndex + 1, end);
		
	}
	
	public int partition(int[] input, int start, int end) {
		
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while ( i < j ) {
			
			// NOTE: empty loop body
			
			while ( i < j && input[--j] >= pivot);
			
			if ( i < j ) {
				input[i] = input[j];
			}
			
			// NOTE: empty look body
			
			while ( i < j  && input [ ++ i ] <= pivot );
			
			if (i < j) {
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		
		return j;
		
		
	}
	
}
