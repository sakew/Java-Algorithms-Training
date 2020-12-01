package sortingAlgorithms;

public class SelectionSort {

	public void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void selectionSortMethod(int[] intArray, int i) {
		for (int ultimaPozitie = intArray.length - 1; ultimaPozitie > 0; ultimaPozitie--) {
			
			int largest = 0;
			
			for (i = 1; i < ultimaPozitie; i++) {
				
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, ultimaPozitie);
		}
	
	for (i = 0; i < intArray.length; i++) {
		System.out.println(intArray[i] + ",");
	}
	}
	
}
