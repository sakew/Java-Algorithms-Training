package searchAlgorithms;

public class BinarySearch {

	// CAUTION: the array/list of items needs to be sorted first.
	
	public int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			System.out.println("mid = " + mid);
			if (input[mid] == value) {
				return mid;
			}
			else if (input[mid] < value) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		
		return -1;
	}
	
}
