import java.util.*;

public class MergeSort {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n - 1);
        System.out.print(Arrays.toString(a));
        sc.close();
    }

    public static void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void merge(int arr[], int l, int mid, int h) {
        int n1 = mid - l + 1, n2 = h - mid;
        int la[] = new int[n1];
        int ra[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            la[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            ra[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (la[i] <= ra[j]) {
                arr[k] = la[i];
                i++;
            } else {
                arr[k] = ra[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = la[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = ra[j];
            j++;
            k++;
        }
    }
}