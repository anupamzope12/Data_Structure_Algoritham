package SelectionSort;

public class Main {
	public static void main(String[] args) {
		int arr[]= {7,6,23,8,5,4,3};
		SelectionSort.SelectionSort(arr);
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}
