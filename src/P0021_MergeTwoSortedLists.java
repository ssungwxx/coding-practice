public class P0021_MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);
        l2.next.next.next = new ListNode(6);

        ListNode result = mergeTwoLists(l1, l2);

        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        else if(l1 == null) return l2;
        else if(l2 == null) return l1;

        int start;
        if (l1.val < l2.val) {
            start = l1.val;
            l1 = l1.next;
        } else {
            start = l2.val;
            l2 = l2.next;
        }

        ListNode res = new ListNode(start);
        ListNode point = res;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                point.next = new ListNode(l1.val);
                point = point.next;
                l1 = l1.next;
            } else {
                point.next = new ListNode(l2.val);
                point = point.next;
                l2 = l2.next;
            }
        }

        ListNode spare = l1 == null ? l2 : l1;

        while (spare != null) {
            point.next = new ListNode(spare.val);
            point = point.next;
            spare = spare.next;
        }

        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
