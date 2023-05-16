package com.example.leetcode;

public class MaximumSubarray {
    static MaximumSubarray maximumSubarray = new MaximumSubarray();
    public static void main(String[] args) {
        int res = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(res);
    }
    public int maxSubArray(int[] nums) {
        int overallMaxSum = nums[0];
        int currentMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMaxSum = Math.max(nums[i], nums[i] + currentMaxSum);
            overallMaxSum = Math.max(overallMaxSum, currentMaxSum);
        }
        return overallMaxSum;
    }
}
