package array;

public class _1295_ {
    public static void main(String[] args) {
        int[] array = {555,901,482,1771};
        System.out.println(findNumbers(array));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEvenNumberOfDigits(num)) count++;
        }
        return count;
    }

    private static boolean isEvenNumberOfDigits(int number) {
        int numberOfDigits = 0;
        while (number > 0) {
            number /= 10;
            numberOfDigits++;
        }

        return numberOfDigits % 2 == 0;
    }
}
