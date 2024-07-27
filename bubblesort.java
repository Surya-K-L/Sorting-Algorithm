import java.util.*;
public class BubbleSort{
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Bubblesort(n, a);
        sc.close();
    }

    public static int[] Bubblesort(int k, int arr[]) {
        for (int i = 0; i < k; i++) {
            int flag = 0;
            for (int j = 0; j < k - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                    flag = 1;
                }
            }
            print(arr);
            if (flag == 0) {
                break;
            }
        }
        return arr;
    }

    public static void print(int t[]) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
}