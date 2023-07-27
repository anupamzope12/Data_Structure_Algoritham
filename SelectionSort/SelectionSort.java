package SelectionSort;

public class SelectionSort {
	public static void SelectionSort(int arr [])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			int min=i;
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min != i) {
				int temp= arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}
}
