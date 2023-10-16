/**
 * TwoSum
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArr;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + nums[i]);
            for (int j = nums.length - 1; j > 0; j--) {
                System.out.println("j = " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    System.out.println(true);
                    int[] newArr = { nums[i], nums[j] };
                    System.out.println(newArr);
                    return newArr;
                } else {
                    System.out.println(false);
                }
            }
        }
    }

}

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Solution s1 = new Solution();
        s1.twoSum(nums, target);

    }
}