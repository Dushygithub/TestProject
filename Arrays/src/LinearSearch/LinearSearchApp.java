package LinearSearch;

public class LinearSearchApp {

	public static void search(int[] arr,int ele) {
		for(int i=0;i<=arr.length-1;i++)
		{
			if(ele==arr[i])
			{
				System.out.println("key is found :"+i);
			}
		}

	}

}
