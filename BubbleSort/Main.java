package BubbleSort;

public class Main {
	 public static void main(String[] args) {
//			int [] arr= {20,9,90,55,45,23,100,1};
		 int [] arr = {10,20,30,40,50,60};
		BubbleSort.bubbleSort(arr);	
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		}
}
