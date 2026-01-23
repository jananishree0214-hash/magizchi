class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {5, 1, 4, 2, 8, 3};
        int n = arr.length;
        int passes = 0;
        for (int i = 0; i < n - 1; i++)
        {
            passes++;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Number of Passes: " + passes);
    }
}