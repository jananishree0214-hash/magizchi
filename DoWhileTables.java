class DoWhileTables
{
	public static void main(String[] args)
	{
		int i=1;
		do
		{
			int a=i*5;
			if(a!=0)
			{
				System.out.println(i +" X 5 = "+a);
			}
			i++;
		}while(i<=10);
	}
}