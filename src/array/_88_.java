package array;

public class _88_ {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 0};
        int value = 2;
        insertNumberIntoArray(array, value);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }

    private static void insertNumberIntoArray(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > value) {
                for (int j = i + 1; j < nums.length; j++) {
                    int temp = nums[j - 1];
                }

                nums[i] = value;

                break;
            }
        }

        for (int num: nums)
            System.out.printf(num + " ");
    }
}
