import java.util.*;

public class Main {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int output[] = Countsort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static int[] Countsort(int arr[]) {
        int m = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            m = Math.max(m, arr[i]);
        }
        int count[] = new int[m + 1];
        for (int i = 0; i < l; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= m; i++) {
            count[i] += count[i - 1];
        }
        int fin[] = new int[l];
        for (int i = l - 1; i >= 0; i--) {
            fin[--count[arr[i]]] = arr[i];
        }
        return fin;
    }
}