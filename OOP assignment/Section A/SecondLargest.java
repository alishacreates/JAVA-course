public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 45, 23, 89, 34};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Largest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
