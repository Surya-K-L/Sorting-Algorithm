import java.util.*;

public class Selectionsort {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        selectionsort(n, a);
        System.out.print(Arrays.toString(a));
        sc.close();
    }

    public static int[] selectionsort(int k, int arr[]) {
        for (int i = 0; i < k; i++) {
            int t = i;
            for (int j = i + 1; j < k; j++) {
                if (arr[j] < arr[t]) {
                    t = j;
                }
            }
            int s = arr[i];
            arr[i] = arr[t];
            arr[t] = s;
        }
        return arr;
    }
}