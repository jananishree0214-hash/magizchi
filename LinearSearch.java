class LinearSearch
{
	public static void main (String[] args)
	
	{
		int[]arr = {10,20,30,40,50};
		int searchvalue= 30;
		
		
		LinearSearch ob = new LinearSearch();
		int index= ob.Linearsearch(arr,searchvalue);
		
		if (index != -1)
		{
			System.out.println("index:"+ index);
		}
		else 
		{
			System.out.println("-1");
		}
	}
	public int Linearsearch(int[]arr,int searchvalue)
	{
		for (int i= 0; i<arr.length; i++)
		{
			if (arr[i]== searchvalue)
			{
				return i;
			}
		}
		return-1;
		
	}
}