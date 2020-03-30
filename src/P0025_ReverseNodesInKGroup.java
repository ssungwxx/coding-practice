public class P0025_ReverseNodesInKGroup {
    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);

        ListNode result = reverseKGroup(input, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(0);
        ListNode point = res;

        loop:
        while (head != null) {
            int[] temp = new int[k];

            ListNode headPoint = head;
            for (int i = 0; i < k; i++) {
                if (headPoint == null) break loop;
                temp[i] = headPoint.val;
                headPoint = headPoint.next;
            }

            for (int i = k -1; i >= 0; i--) {
                point.next = new ListNode(temp[i]);
                point = point.next;
                head = head.next;
            }
        }

        while(head != null){
            point.next = new ListNode(head.val);
            point = point.next;
            head = head.next;
        }

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
