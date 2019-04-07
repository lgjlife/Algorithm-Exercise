package leetcode.bit;


/**
 *功能描述
 * @author lgj
 * @Description
 *
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 *
*/
public class Question371 {

    public int getSum(int a, int b) {

        return b == 0 ? a : getSum(a^b,(a&b)<<1);
    }

    public static void main(String args[]){
        Question371 question = new Question371();
        int sum = question.getSum(1,2);
        System.out.println("sum = " + sum);

        sum = question.getSum(-2,4);
        System.out.println("sum = " + sum);


        sum = question.getSum(-8,4);
        System.out.println("sum = " + sum);

        sum = question.getSum(-7,-2);
        System.out.println("sum = " + sum);

    }
}
