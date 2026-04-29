public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        System.out.println("Duplicate elements are:");
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        int n = arr.length;

        // This method works when elements are in range 0 to n-1
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] = arr[index] + n;
        }

        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                System.out.println(i);
            }
        }
    }
}