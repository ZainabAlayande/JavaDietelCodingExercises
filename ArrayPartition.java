package LeetCodeAlgorithms;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        int[] array = {6, 2, 6, 5, 1, 2};

        System.out.println(arrayPairSum(array));
    }


    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for(int k = 0; k < nums.length; k+=2) {
            sum = sum + nums[k];

            if(k == nums.length-2) {
                break;
            }

        }
        return sum;

    }


}
