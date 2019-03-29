package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 *功能描述 
 * @author lgj
 * @Description
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @date 3/29/19
*/
public class question1 {

    //40 ms
    public static  int[] twoSum(int[] nums, int target){

        int[] arr = new int[2];

        int dif = 0;
        for(int i = 0; i< nums.length-1; i++){
            dif = target - nums[i];

            for(int j = i+1; j < nums.length; j++){
                if(dif  == nums[j]){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return  null;

    }

    //6 ms
    public static  int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> hashSet = new HashMap<Integer,Integer>();

        int dif = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            dif = target - nums[i];
            Integer index = hashSet.get(dif);
            if(index != null){
                if(i < index){
                    return new int[]{i , index};
                } else {
                    return new int[]{index , i};
                }
            } else {
                hashSet.put(nums[i] , i);
            }
        }

        return new int[]{};
    }


    public static void main(String args[]){

        int[]  array = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(array,target);
        for(int data : result){
            System.out.println(data);
        }

        result = twoSum1(array,target);
        for(int data : result){
            System.out.println(data);
        }



    }
}
