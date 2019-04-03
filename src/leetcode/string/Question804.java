package leetcode.string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *功能描述 
 * @author lgj
 * @Description
 *
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 *
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 *
 * 返回我们可以获得所有词不同单词翻译的数量。
 *
 * 例如:
 * 输入: words = ["gin", "zen", "gig", "msg"]
 * 输出: 2
 * 解释:
 * 各单词翻译如下:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * 共有 2 种不同翻译, "--...-." 和 "--...--.".
 *
 * 单词列表words 的长度不会超过 100。
 * 每个单词 words[i]的长度范围为 [1, 12]。
 * 每个单词 words[i]只包含小写字母。
 *
 * @date 4/3/19
*/
public class Question804 {

    public int uniqueMorseRepresentations(String[] words) {


        if(words == null){
            return  0;
        }
        if(words.length <= 1){
            return words.length;
        }
        String[] mapping = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};



        HashSet<String> set = new HashSet<String>();

        for(String word:words ){
            StringBuilder builder = new StringBuilder();

            //8ms  50%
            /*byte[] bys =  word.getBytes();
            for(byte by:bys){
                builder.append(mapping[by-97]);
            }*/

            //4ms 100%
            char[] chs  =  word.toCharArray();
            for(char ch:chs){
                builder.append(mapping[ch-'a']);
            }
            set.add(builder.toString());

        }


        return  set.size();

    }


    public static void main(String args[]){
        Question804 quest = new Question804();

        String[] inData =  {"gin", "zen", "gig", "msg"};

        int result = quest.uniqueMorseRepresentations(inData);
        System.out.println(result);

        String[] inData1 = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        result = quest.uniqueMorseRepresentations(inData1);
        System.out.println(result);



    }
}
