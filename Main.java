import searchAlgorithms.BinarySearch;

public class Main {

	public static void main(String[] args) {
			
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		
		BinarySearch search = new BinarySearch();
		
		System.out.println(search.iterativeBinarySearch(intArray, -15));
		System.out.println(search.iterativeBinarySearch(intArray, 35));
		
		
	}			
}



