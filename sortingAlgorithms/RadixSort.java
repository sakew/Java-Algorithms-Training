package sortingAlgorithms;

public class RadixSort {

	
	public void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}
	}
	
	public void radixSingleSort (int[] input, int position, int radix) {
		
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for (int value : input) {
			
			countArray[getDigit(position, value, radix)]++;
		
		}
		// Adjust the count array
		
		for ( int j = 1; j < radix; j++ ) {
			countArray[j] += countArray[j - 1];
		}
		
		int[] temp = new int[numItems];
		for ( int tempIndex = numItems - 1; tempIndex >= 0; tempIndex-- ) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = 
					input[tempIndex];
		}
		
		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
	}
	
	public int getDigit( int position, int value, int radix) {
		
		return value / (int) Math.pow(radix, position) % radix;
		
	}
	
}
