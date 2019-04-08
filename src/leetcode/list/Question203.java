package leetcode.list;

/**
 *功能描述 
 * @author lgj
 * @Description
删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 * @date 4/8/19
*/
public class Question203 {


    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return  null;
        }
        return  null;

    }


    public static void main(String args[]){

        ListNode node = new ListNode(1);
        node.next =  new ListNode(2);
        node.next.next =  new ListNode(3);
        node.next.next.next =  new ListNode(4);
        node.next.next.next =  new ListNode(5);

        Question203 question = new Question203();

    }
}


