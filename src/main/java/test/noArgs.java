package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class noArgs {
    int[] tmp;
    public static void main(String[] args) {
        int[] nums=new int[]{5,1,1,2,0,0};
        noArgs noArgs = new noArgs();
        noArgs.sortArray(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    int[] sortArray(int[] nums) {
        tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) /2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        int i = l, j = mid + 1;
        int cnt = l;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[cnt++] = nums[i++];
            } else {
                tmp[cnt++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[cnt++] = nums[i++];
        }
        while (j <= r) {
            tmp[cnt++] = nums[j++];
        }
        //注意这里是k+l
        for (int k = l; k < r+1; ++k) {
            nums[k] = tmp[k];
        }
    }
}
