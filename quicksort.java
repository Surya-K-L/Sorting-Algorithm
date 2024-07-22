import java.util.*;

public class quicksort {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Quicksort(a, 0, n - 1);
        System.out.print(Arrays.toString(a));
    }

    public static void Quicksort(int arr[], int low, int high) {
        if (low < high) {
            int mid = partition(arr, low, high);
            partition(arr, low, mid - 1);
            partition(arr, mid + 1, high);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[h];
        arr[h] = arr[i + 1];
        arr[i + 1] = temp;
        System.out.println(Arrays.toString(arr));

        return i + 1;
    }
}