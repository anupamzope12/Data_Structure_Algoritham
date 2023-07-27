package BubbleSort;

public class BubbleSort {
	
	public static void bubbleSort(int [] arr) {
		int passes = arr.length - 1;
		int comps=arr.length - 1;
		 for(int i=0 ; i<passes ; i++) {
			 int count=0;
		 for(int j=0 ; j<(comps-i) ; j++ )
		 {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
				 count ++;
			 }
		 }
		 
		 if(count == 0) {
             System.out.println("Passes: " + (i+1));
             return;
	  }
	}
  }
}
 


