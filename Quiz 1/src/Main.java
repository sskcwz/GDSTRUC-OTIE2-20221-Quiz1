public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers[0] = 801;
        numbers[1] = 319;
        numbers[2] = 18;
        numbers[3] = 89;
        numbers[4] = 20;
        numbers[5] = 125;
        numbers[6] = 22;
        numbers[7] = 16;
        numbers[8] = 7;
        numbers[9] = 814;

        // BUBBLE SORT
        System.out.print("=====BUBBLE SORT=====\n");

        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers);
        System.out.print("\n\n");

        System.out.print("Array After Sorting: ");
        bubbleSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n\n");

        // SELECTION SORT
        System.out.print("=====SELECTION SORT=====\n");

        System.out.print("Array After Sorting: ");
        selectionSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n");
    }

    private static void printArrayElements(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    private static void bubbleSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int firstSortedIndex = numbers.length - 1; firstSortedIndex > 0; firstSortedIndex--) {
            int smallestIndex = 0;

            for (int i = 1; i <= firstSortedIndex; i++) {
                if (numbers[i] < numbers[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[firstSortedIndex];
            numbers[firstSortedIndex] = temp;
        }
    }



}