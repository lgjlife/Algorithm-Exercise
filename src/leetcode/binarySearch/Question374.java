package leetcode.binarySearch;

/**
 *功能描述
 * @author lgj
 * @Description 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 *
 *
 * @date 4/7/19
*/
public class Question374 extends GuessGame {



    public int guessNumber(int n) {

        int num = (1 + n ) >> 1;

        return  0;

    }

    public static void main(String args[]){
        Question374 question374= new Question374();

        question374.guessNumber(10);

    }
}

class  GuessGame{

    private     int pickNum = 6;
    private     int max;

    public void setMax(int max) {
        this.max = max;
    }
}
