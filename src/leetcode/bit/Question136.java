package leetcode.bit;


/**
 *功能描述
 * @author lgj
 * @Description  给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 交换律：a ^ b ^ c <=> a ^ c ^ b
 *
 * 任何数于0异或为任何数 0 ^ n => n
 *
 * 相同的数异或为0: n ^ n => 0
 * @date 4/6/19
*/
public class Question136 {

    public int singleNumber(int[] nums) {

        if(nums == null){
            throw  new NullPointerException();
        }
        //执行用时 : 2 ms, 在Single Number的Java提交中击败了47.12% 的用户
        int result = 0;
        /*for(int num:nums){
            result ^= num;
        }*/
        //执行用时 : 1 ms, 在Single Number的Java提交中击败了99.44% 的用户
        int i = nums.length - 1;
        while (i >= 0){
            result ^= nums[i];
            i--;
        }

        return  result;
    }

    public static void main(String args[]){
        Question136 question136 = new Question136();

        int[] nums = {2,2,1};
        int result = question136.singleNumber(nums);
        System.out.println("result = " + result);

        int[] nums1 = {4,1,2,1,2};
         result = question136.singleNumber(nums1);
        System.out.println("result = " + result);



    }
}
