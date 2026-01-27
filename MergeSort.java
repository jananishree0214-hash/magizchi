import java.util.Arrays;
public class MergeSort {

    public static void main(String[] args)
    {
        int[] arr = {10, 3, 7, 1, 9, 4, 8};

        MergeSort ms = new MergeSort();
        int[] sorted = ms.divide(arr);

        System.out.println("Sorted Array:");
        ms.print(sorted, 0);

        int mid = sorted.length / 2;
        System.out.println("\nMiddle Element: " + sorted[mid]);
    }

    public void print(int[] arr, int i)
    {
        if (i == arr.length)
            return;

        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    public int[] divide(int[] arr)
    {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right, 0, 0, new int[left.length + right.length], 0);
    }
    public int[] merge(int[] left, int[] right, int i, int j, int[] res, int k)
    {
        if (i == left.length && j == right.length)
            return res;

        if (i == left.length)
        {
            res[k] = right[j];
            return merge(left, right, i, j + 1, res, k + 1);
        }

        if (j == right.length)
        {
            res[k] = left[i];
            return merge(left, right, i + 1, j, res, k + 1);
        }

        if (left[i] < right[j])
        {
            res[k] = left[i];
            return merge(left, right, i + 1, j, res, k + 1);
        }
        else
        {
            res[k] = right[j];
            return merge(left, right, i, j + 1, res, k + 1);
        }
    }
}