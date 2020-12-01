package sortingAlgorithms;

public class BubbleSort {

	
	public void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void bubbleSortMethod(int[] intArray, int i) {
		
		for (int ultimaPozitie = intArray.length - 1; ultimaPozitie > 0; ultimaPozitie--) {
			for (i = 0; i < ultimaPozitie; i++) {
				if(intArray[i] > intArray[i + 1]) {
					swap(intArray,i, i + 1);
				}
			}
		}
		for (i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + ",");
		}
	}
	
}
