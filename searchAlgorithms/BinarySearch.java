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
	
	public int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input, 0, input.length, value);
	}
	public int recursiveBinarySearch(int[] input, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		System.out.println("mid = " + mid);
		
		if (input[mid] == value) {
			return mid;
		}
		else if (input[mid] < value) {
			return recursiveBinarySearch(input, mid + 1, end, value);
		}
		else {
			return recursiveBinarySearch(input, start, mid, value);
		}
	}
}
