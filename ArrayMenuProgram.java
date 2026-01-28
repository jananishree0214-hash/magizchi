import java.util.Scanner;

public class ArrayMenuProgram 
{

    static int[] arr;
    static int n;
    static boolean isSorted = false;

    static void acceptArray(Scanner sc) 
	{
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }
        isSorted = false;
    }

    static void displayArray() 
	{
        if (arr == null) 
		{
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort() 
	{
        for (int i = 0; i < n - 1; i++) 
		{
            for (int j = 0; j < n - 1 - i; j++) 
			{
                if (arr[j] > arr[j + 1]) 
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        isSorted = true;
        System.out.println("Array sorted using Bubble Sort.");
    }

    static void selectionSort() 
	{
        for (int i = 0; i < n - 1; i++) 
		{
            int min = i;
            for (int j = i + 1; j < n; j++) 
			{
                if (arr[j] < arr[min]) 
				{
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        isSorted = true;
        System.out.println("Array sorted using Selection Sort.");
    }

    static void mergeSort(int l, int r) 
	{
        if (l < r) 
		{
            int m = (l + r) / 2;
            mergeSort(l, m);
            mergeSort(m + 1, r);
            merge(l, m, r);
        }
    }

    static void merge(int l, int m, int r) 
	{
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) 
		{
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    static void linearSearch(Scanner sc) 
	{
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) 
		{
            if (arr[i] == key) 
			{
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    static void binarySearch(Scanner sc) 
	{
        if (!isSorted) 
		{
            System.out.println("Binary Search requires sorted array!");
            return;
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        while (low <= high) 
		{
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
			{
                System.out.println("Element found at index " + mid);
                return;
            } 
			else if (arr[mid] < key) 
			{
                low = mid + 1;
            } 
			else 
			{
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
		{
            System.out.println("\n---- MENU ----");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    acceptArray(sc);
                    break;

                case 2:
                    displayArray();
                    break;

                case 3:
                    System.out.println("Choose Sorting Method:");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Selection Sort");
                    System.out.println("3. Merge Sort");
                    int sortChoice = sc.nextInt();

                    if (sortChoice == 1)
                        bubbleSort();
                    else if (sortChoice == 2)
                        selectionSort();
                    else if (sortChoice == 3) 
					{
                        mergeSort(0, n - 1);
                        isSorted = true;
                        System.out.println("Array sorted using Merge Sort.");
                    } 
					else
                        System.out.println("Invalid choice.");
                    break;

                case 4:
                    System.out.println("Choose Searching Method:");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    int searchChoice = sc.nextInt();

                    if (searchChoice == 1)
                        linearSearch(sc);
                    else if (searchChoice == 2)
                        binarySearch(sc);
                    else
                        System.out.println("Invalid choice.");
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}