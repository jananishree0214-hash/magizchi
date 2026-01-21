class BinarySearch
{
	public static void main (String[] args)
	
	{
		int[]arr = {2,5,8,12,16,23,38};
		int searchvalue= 16;
		
		BinarySearch ob=new BinarySearch();
		int index= ob.binarysearch(arr,searchvalue);
		System.out.println(index);
	}
	public int binarysearch(int[]arr,int searchvalue)
	{
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		while(left<=right)
		{
			if(searchvalue==arr[mid])
			{
				return mid;
			}
			else if (searchvalue>arr[mid])
			{
				left= mid+1;
			}
		   else if (searchvalue<arr[mid])
		    {
			right = mid-1;
		    }
			mid = (left+right)/2;
		}
		return-1;
		
	}
}