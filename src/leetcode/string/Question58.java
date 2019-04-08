package leetcode.string;


/**
 *功能描述 
 * @author lgj
 * @Description 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * 执行用时 : 1 ms, 在Length of Last Word的Java提交中击败了100.00% 的用户
 * @date 4/3/19
*/
public class Question58 {


    public int lengthOfLastWord(String s) {
        char[] ch =  s.toCharArray();
        int count = ch.length-1;

        int end = 0;

        while((count > -1) && (ch[count] == ' ')){
            end++;
            count--;
        }
      //  System.out.println("end = " + end);
        while((count > -1) && (ch[count] != ' ')){
            count--;
        }

        return  ch.length-1 - count - end;
    }

    public static void main(String args[]){
        Question58 question = new Question58();

        String str = null;
        int result = 0;
         str = "Hello World";
         result = question.lengthOfLastWord(str);

        System.out.println(str + "-->" + result);

        str = "HelloWorld";
        result = question.lengthOfLastWord(str);

        System.out.println(str + "-->" + result);

        str = "H ";
        result = question.lengthOfLastWord(str);

        System.out.println(str + "-->" + result);
    }
}
