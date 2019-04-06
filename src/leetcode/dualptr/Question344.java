package leetcode.dualptr;


/**
 *功能描述
 * @author lgj
 * @Description
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 *
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * 执行用时 : 3 ms, 在Reverse String的Java提交中击败了90.23% 的用户
 * @date 4/6/19
*/
public class Question344 {

    public void reverseString(char[] s) {



        if(s == null){
            throw  new NullPointerException();
        }
        char temp ;
        int left = 0;
        int right = s.length-1;

        while (left < right){
            temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;

            // 不去掉4ms
          //  left++;
          //  right--;
        }



    }

    public static void main(String args[]){
        Question344 question344 = new Question344();

        char[] sIns  = {'h','e','l','l','o'};
        for(char ch:sIns){
            System.out.print(ch + "  ");
        }
        System.out.println();
        question344.reverseString(sIns);
        for(char ch:sIns){
            System.out.print(ch + "  ");
        }

        System.out.println();
        ////////////////////////////

        char[] sIns1  = {'h'};
        for(char ch:sIns1){
            System.out.print(ch + "  ");
        }
        System.out.println();
        question344.reverseString(sIns1);
        for(char ch:sIns1){
            System.out.print(ch + "  ");
        }

        System.out.println();
        ///////////////////////

        char[] sIns2  = {'h','2'};
        for(char ch:sIns2){
            System.out.print(ch + "  ");
        }
        System.out.println();
        question344.reverseString(sIns2);
        for(char ch:sIns2){
            System.out.print(ch + "  ");
        }
       //////////////////////




    }
}
