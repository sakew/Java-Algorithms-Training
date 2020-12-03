package sortingAlgorithms;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {

	// BucketSort algorithm for sorting hash table items to avoid collision.
	@SuppressWarnings("unchecked")
	public void bucketSort(int[] input) {
		List<Integer>[] buckets = new List[10];
		
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Integer>();
			
		}
		
		for (int i = 0; i < input.length; i++) {
			buckets[hash(input[i])].add(input[i]);
		}
		
		for (@SuppressWarnings("rawtypes") List bucket: buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for (int i = 0; i < buckets.length; i ++) {
			for (int value: buckets[i]) {
				input[j++] = value;
			}
		}
	}
	
	private static int hash(int value) {
		return value / (int) 10 % 10;
	}
}
