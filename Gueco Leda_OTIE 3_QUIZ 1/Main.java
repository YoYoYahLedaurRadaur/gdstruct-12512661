public class Main {

    public static void main(String[] args) {

        // Create an array and assign the given numbers
        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -58;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        // Make separate copies for both sorting algorithms
        int[] bubbleNumbers = numbers.clone();
        int[] selectionNumbers = numbers.clone();

        // Display the original array
        System.out.println("Original Array:");
        printArrayElements(numbers);

        // Apply Bubble Sort
        bubbleSort(bubbleNumbers);

        System.out.println("\nBubble Sort - Descending Order:");
        printArrayElements(bubbleNumbers);

        // Apply Selection Sort
        selectionSort(selectionNumbers);

        System.out.println("\nSelection Sort - Descending Order:");
        printArrayElements(selectionNumbers);
    }

    // Bubble Sort - Arrange numbers from largest to smallest
    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            // Compare each number with the next one
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap if the left number is smaller
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort - Find the smallest number and place it at the end
    private static void selectionSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            // Assume the first number is the smallest
            int smallestIndex = 0;

            // Look for the smallest number in the unsorted portion
            for (int j = 1; j <= i; j++) {

                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap the smallest number with the last unsorted position
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    // Display all elements of the array
    private static void printArrayElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
