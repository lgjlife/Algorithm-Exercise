package book4.ch1;

import java.util.Random;
import java.util.Stack;

/**
 *功能描述
 * @author lgj
 * @Description  实现一个特殊的栈，在实现栈的基本功能上，再实现返回的最小元素的操作
 * @date 6/2/19
 * @param:
 * @return:
 *
*/
public class GetMin extends Stack<Integer>{

    public static void main(String args[]){

        GetMin target = new GetMin();

        for (int i = 0; i < 10;i++){

            target.push(new Random().nextInt(100));

        }
        for (int i = 0; i < 10;i++){

            target.pop();

        }

        System.out.println(target);


        System.out.println(target.getMin());
        System.out.println(target.getMin());
        System.out.println(target.getMin());
        System.out.println(target.getMin());
        System.out.println(target.getMin());

    }

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public Integer getMin(){

        return minStack.peek();
    }


    @Override
    public Integer push(Integer item) {
        dataStack.push(item);

        if(minStack.size()!=0){
            Integer top = minStack.peek();
            if( (top != null) && (item <= top)){
                minStack.push(item);
            }
        }
        else {
            minStack.push(item);
        }


        return item;
    }

    @Override
    public synchronized Integer pop() {
        Integer result = 0;
        result = dataStack.pop();
        Integer top = minStack.peek();

        if(top == result){
            minStack.pop();
        }
        return result;

    }

    @Override
    public synchronized Integer peek() {
       return dataStack.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public synchronized int search(Object o) {
        return super.search(o);
    }

    @Override
    public String toString() {
        return "GetMin{" +
                "dataStack=" + dataStack +
                ", minStack=" + minStack +
                '}';
    }
}
