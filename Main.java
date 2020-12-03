import sortingAlgorithms.BucketSort;

public class Main {

	public static void main(String[] args) {
			
		
		int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };
		
		BucketSort bucket = new BucketSort();
		bucket.bucketSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
	}
			
}



