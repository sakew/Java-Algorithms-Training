package sortingAlgorithms;

public class MergeSort {
	
	
	public void mergeSortMethod( int[] input, int start, int end ) {
		
		if ( end - start < 2 ) {
		
			return;
		
		}
		
		int mid = ( start + end ) / 2;
		
		mergeSortMethod( input, start , mid);
		
		mergeSortMethod( input, mid, end );
		
		merge(input, start, mid, end);
		
	}
	
	public void merge( int[] input, int start, int mid, int end ) {
		
// this is descending sorting, if you want ascending change >= to <=		
		
		if ( input[ mid - 1 ] >= input[ mid ]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		while ( i < mid && j < end ) {

// this is descending sorting, if you want ascending change >= to <=		
			
			
			temp[ tempIndex++ ] = input[ i ] >= input[ j ] ? input[ i++ ] : input[ j++ ];
		}
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
}
