import java.util.*;

public class Main {

    // first occurrence
    public static int firstIndex(int[] a, int k) {
        int left = 0, right = a.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == k) {
                ans = mid;
                right = mid - 1;   // left side search
            } else if (a[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // last occurrence
    public static int lastIndex(int[] a, int k) {
        int left = 0, right = a.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == k) {
                ans = mid;
                left = mid + 1;   // right side search
            } else if (a[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int first = firstIndex(array, k);
        int last = lastIndex(array, k);

        System.out.println(first + " " + last);
    }
}
