package Insertion_Sort;

public class Insertion_Sort {
public static void insertionSort(int [] arr) {
	for(int i=0 ; i<arr.length ; i ++) {
		for(int j=0 ; j<i ;j++)
		{
			if(arr[i] < arr[j]) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
	}
	}
	public static void insertionSort1(int [] arr) {
		for(int i=0 ; i<arr.length ; i ++) {
			for(int j=0 ; j<i ;j++)
			{
				if(arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
		}
}
}
