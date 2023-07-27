package Insertion_Sort;

public class Main {
public static void main(String[] args) {
	int arr [] = {10,50,20,40,80,70};
	Insertion_Sort.insertionSort(arr);
//	Insertion_Sort.insertionSort1(arr);
	for(int val : arr) {
		System.out.print(val + " ");
	}
}

}
