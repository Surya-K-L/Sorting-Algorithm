import java.util.*;

public class RadixSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), arr[] = new int[N];
        int Max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            Max = Math.max(Max, arr[i]);
        }
        radixSort(arr, N, (int) Math.log10(Max) + 1);
        sc.close();
    }

    public static void radixSort(int arr[], int N, int len) {
        int div = 1;
        for (int i = 0; i < len; i++) {
            int[] countArr = new int[10], outputArr = new int[N];
            for (int j = 0; j < N; j++) {
                int digit = (arr[j] / div) % 10;
                countArr[digit]++;
            }
            for (int j = 1; j < countArr.length; j++)
                countArr[j] += countArr[j - 1];

            for (int j = N - 1; j >= 0; j--) {
                int digit = (arr[j] / div) % 10;
                outputArr[countArr[digit] - 1] = arr[j];
                countArr[digit]--;
            }
            arr = outputArr;
            div *= 10;
            System.out.println(Arrays.toString(outputArr));
        }
    }
}