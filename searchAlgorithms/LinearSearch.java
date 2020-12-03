package searchAlgorithms;

public class LinearSearch {

	public int linearSearch(int[] input, int value) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
	
}
