package Kodnest;

public class BinarySearch01 {

	public static void check(int arr[], int key) {
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
		if(key==arr[mid])
		{
		       System.out.println("key" +key+" is found in the index"+mid);
		       return ;
		}
		else if(key>=arr[mid])
		{
			low=mid;
			high=high;
			mid=(low+high)/2;
			
			
		}
		else
		{
			high=mid-1;
			low=low;
			mid=(low+high)/2;
			
		}
		} 
		System.out.println("key is not found");

	}

}
