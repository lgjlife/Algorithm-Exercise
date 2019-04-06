package leetcode.binarySearch;

public class Question704 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) >> 1;


        if (nums == null){
            throw new NullPointerException();
        }


        while (left <= right){

            if(nums[mid] == target){
                return  mid;
            }
            else if( nums[mid] < target ){
                left = mid+1;
            }
            else if( nums[mid] > target ){
                right = mid-1;
            }
            mid = (left + right) >> 1;
           // System.out.println("mid = " + mid);
        }

        return  -1;

    }

    public static void main(String args[]){
        Question704 question704 = new Question704();

        int[]  nums = {-1,0,3,5,9,12};
        int result = question704.search(nums,100);
        System.out.println("result = " + result);


        int[]  nums1 = {};
        result = question704.search(nums1,100);
        System.out.println("result = " + result);






    }
}
