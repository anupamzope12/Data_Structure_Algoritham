package Heap_Sort;

public class Main {
	public static void main(String[] args) {
	int [] arr= {21,85,97,56,123,36};
	HeapSort.heapSort(arr, arr.length);
	for(int val : arr) {
		System.out.print(val + " ");
	}
	System.out.println();
	}
}
