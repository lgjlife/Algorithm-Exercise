package leetcode.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *功能描述 
 * @author lgj
 * @Description
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @date 4/8/19
*/
public class Question206 {


    public ListNode reverseList(ListNode head) {

        if(head.next != null){
            ListNode temp = new ListNode(head.next.val);
            temp.next = head.next.next;
            head.next.next =  head;
        }

        return  null;





    }


    public static void main(String args[]){

        ListNode node = new ListNode(1);
        node.next =  new ListNode(2);
        node.next.next =  new ListNode(3);
        node.next.next.next =  new ListNode(4);
        node.next.next.next =  new ListNode(5);

        Question206 question = new Question206();

    }
}

