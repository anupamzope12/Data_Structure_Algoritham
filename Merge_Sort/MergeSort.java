package Merge_Sort;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {4,7,9,2,8,1,6,3,5};
		System.out.println("Before sort :" + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("After Sort : " +Arrays.toString(arr));
	}
	
	private static void mergeSort(int [] arr)
	{
		mergeSort(arr,0,arr.length-1);
	}
	
	private static void mergeSort(int arr[],int left,int right)
	{
		//if partition is invalid or single element in partition,then return 
		if(left==right)
			return;
		//divide the array into two equal parts
		int mid=(left + right)/2;
		//sort left (left to mid) and right (mid+1 to right)
		mergeSort(arr,left,mid);
		mergeSort(arr, mid+1, right);
		//created temporary array to accomodate both partition
		int temp[] = new int[right-left+1];
		//merge two sorted array into temp array
		int i=left , j=mid+1 ,k=0;
		//compare elements from both partitions and coppy the smaller one 
		//(until any one partition is done)
		while(i<=mid && j<=right) {
			if(arr[i]< arr[j])
			{
				temp[k]=arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		//copy the remaiing element from other partitions
		while(i<=mid)
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		while(j<= right)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		//overwrite temp array back to main or original array
		for(k=0 ; k<temp.length;k++)
		{
			arr[left+k]=temp[k];
		}

	}
}
