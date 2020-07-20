package leetcode;

public class P0024_SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);

        ListNode result = swapPairs(input);

        while(result !=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode point = res;

        while(head != null && head.next != null){
            point.next = new ListNode(head.next.val);
            point = point.next;
            point.next = new ListNode(head.val);
            point = point.next;
            head = head.next.next;
        }

        if(head != null) point.next = new ListNode(head.val);

        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
