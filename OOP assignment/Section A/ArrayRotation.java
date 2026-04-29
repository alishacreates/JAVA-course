import java.util.Scanner;

public class ArrayRotation {
    // Function to rotate array left by k positions
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to rotate array right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Helper function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] leftArr = {1, 2, 3, 4, 5};
        int[] rightArr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        printArray(leftArr);

        rotateLeft(leftArr, k);
        System.out.println("Array after left rotation by " + k + " positions:");
        printArray(leftArr);

        rotateRight(rightArr, k);
        System.out.println("Array after right rotation by " + k + " positions:");
        printArray(rightArr);
    }
}