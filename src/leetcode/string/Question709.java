package leetcode.string;


/**
 *功能描述 
 * @author lgj
 * @Description 
 * @date 4/3/19
*/
public class Question709 {


    public String toLowerCase(String str) {
        byte[] bs =str.getBytes();

        //1ms
        /*for (int i = 0; i < bs.length; i++){
            bs[i] = (byte)(((bs[i] >64)&&(bs[i] <= 91))?(bs[i]+32):bs[i]);
        }*/

        /*
        * 执行用时 : 0 ms, 在To Lower Case的Java提交中击败了100.00% 的用户
          内存消耗 : 35.7 MB, 在To Lower Case的Java提交中击败了0.96% 的用户
        * */
        int i = 0;
        while (i < bs.length){
            bs[i] = (byte)(((bs[i] >64)&&(bs[i] <= 91))?(bs[i]+32):bs[i]);
            i++;
        }


        return  new String(bs);
    }

    public static void main(String args[]){
        Question709 question = new Question709();
        String result = null;

        result = question.toLowerCase("al&phaBET");
        System.out.println(result.toString());
    }
}
