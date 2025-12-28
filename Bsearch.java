import java.util.*;

class Bsearch {

    // Method to perform Binary Search
    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;            // element found
            } else if (arr[mid] < key) {
                left = mid + 1;        // search right half
            } else {
                right = mid - 1;       // search left half
            }
        }
        return -1;                     // element not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();       // size of array
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);              // binary search requires sorted array

        int key = sc.nextInt();        // element to search

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
