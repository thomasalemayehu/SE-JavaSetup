package additionalCoding;

public class SecondBiggestFinder {

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {19, 9, 11, 0, 12};


        System.out.println("Second biggest in [1, 2, 3, 4, 5]: " + findSecondBiggest(numbers1));
        System.out.println("Second biggest in [19, 9, 11, 0, 12]: " + findSecondBiggest(numbers2));
    }

    public static int findSecondBiggest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }


        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements");
        }

        return secondLargest;
    }
}
