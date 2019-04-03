package leetcode.math;

/**
 *功能描述 
 * @author lgj
 * @Description
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @date 4/3/19
*/
public class Question7 {

    public int reverse(int x) {

        int result = 0;
        char  h = '-';
        String str = String.valueOf(x);
        char[] b = str.toCharArray();

        int offset = 0;
        if(b[0] == h){
             offset = 1;
        }
        else {
            offset = 0;
        }
        int maxCount = (b.length) >> 1;
        int count = 0;
        //  System.out.println("maxCount = " + maxCount);
        while (count < maxCount){
            int lindex = count + offset;
            int rindex = b.length-count-1;
            swap(b,lindex,rindex);
            count++;
        }



        try{
            result = Integer.valueOf(String.valueOf(b));
        }
        catch(Exception ex){
           return  0;
        }




        return result;

    }

    public  void swap(char[] arr,int x , int y){
        char temp = 0;
        temp =  arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String args[]){
        int inData = 0;
        Question7 question7 = new Question7();

        //正数测试
        inData = 1;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = 12;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = 123;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = 123456789;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = 1234567890;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        System.out.println("-------------------------------");
        //负数测试

        inData = -1;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = -12;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = -123;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = -123456789;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();

        inData = -1234567890;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();


        inData = 1534236469;
        System.out.println("in data = " + inData + ",  out data = " + question7.reverse(inData));

        System.out.println();





    }
}
