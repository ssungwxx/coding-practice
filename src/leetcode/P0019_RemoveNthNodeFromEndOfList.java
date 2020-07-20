package leetcode;

public class P0019_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(ln,2);

        while(result.next != null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = head;
        int length = 1;

        ListNode point = head;
        while(point.next != null){
            length++;
            point = point.next;
        }

        ListNode pre = null;
        point = head;

        if(length == n ){
            result = head.next;
        }else{
            for(int i =0; i < length - n; i++){
                pre = point;
                point = point.next;
            }

            pre.next = point.next;
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
