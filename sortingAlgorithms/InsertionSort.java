package sortingAlgorithms;

public class InsertionSort {

	public void insertionSortMethod(int[] intArray, int i) {
		
		for (int firstUnsorted = 0; firstUnsorted < intArray.length; firstUnsorted++) {
			int newElement = intArray[firstUnsorted];
			
			for (i = firstUnsorted; i > 0 && intArray[i-1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}
		
		for (i = 0; i < intArray.length; i ++) {
			System.out.println(intArray[i] + ",");
		}
		
	}
	
	public void recursiveInsertionSort(int[] input, int numItems) {
		
		if (numItems < 2) {
			return;
		}
			
			recursiveInsertionSort(input, numItems - 1);
			
			int newElement = input[numItems - 1];
			
			int i;
			
			for (i = numItems - 1; i > 0 && input[i-1] > newElement; i--) {
				input[i] = input[i - 1];
			}
			input[i] = newElement;
			
			System.out.println("Result of call when numItems = " + numItems);
			for ( i = 0; i < input.length; i++ ) {
				System.out.print(input[i]);
				System.out.print(", ");
			}
			System.out.println("");
			System.out.println("------------------");
			
			
		}
		
	}
	

