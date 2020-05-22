package com.liuc.sortAlgorithm.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] nums, int key) {

        int low = 0, hight = nums.length;
        while (low <= hight) {
            // 在计算 mid 时不能使用 mid = (l + h) / 2 这种方式，因为 l + h 可能会导致加法溢出，应该使用 mid = l + (h - l) / 2。
            int mid = low + (hight - low) / 2;
            if (key == nums[mid]) return nums[mid];
            if (key < nums[mid]) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int result = new BinarySearch().binarySearch(nums,4);
        System.out.println(result);
    }
}
