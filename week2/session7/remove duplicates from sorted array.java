import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 1, 2};

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println("nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

Input
nums =
[1,1,2]
Output
[1,2]
}
