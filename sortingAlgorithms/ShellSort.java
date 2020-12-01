package sortingAlgorithms;

public class ShellSort {

	public void shellSortMethod(int[] intArray, int i, int j) {
		
		for ( int gap = intArray.length / 2; gap > 0; gap /= 2 ) {
			
			for (i = gap; i < intArray.length; i++) {
				int newElement = intArray[ i ];
				
				j = i;
				
				while ( j >= gap && intArray[ j - gap ] > newElement) {
					
					intArray[ j ] = intArray[ j - gap ];
					
					j -= gap;
				}
				
				intArray[ j ] = newElement;
			}
			
			}

		for ( i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + ",");
			
		}
	}
}
