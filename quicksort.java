import java.util.*;

public class Main {
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

    public static int partition(int arr[], int low, int high) {
        int t = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= j && arr[i] < t) {
                i++;
            }
            while (i <= j && arr[j] > t) {
                j--;
            }
            if (i <= j) {
                int s = arr[i];
                arr[i] = arr[j];
                arr[j] = s;
                i++;
                j--;
            }
        }
        int z = arr[low];
        arr[low] = arr[j];
        arr[j] = z;
        return j;
    }
}