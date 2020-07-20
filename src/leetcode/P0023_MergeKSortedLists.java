package leetcode;

import java.util.Collections;
import java.util.LinkedList;

public class P0023_MergeKSortedLists {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        ListNode b = new ListNode(1);
        b.next = new ListNode(5);
        ListNode c = new ListNode(2);
        c.next = new ListNode(4);

        ListNode[] input = {a,b,c};

        ListNode result = mergeKLists(input);

        while(result !=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(-1);
        ListNode point = res;

        LinkedList<Integer> temp = new LinkedList<>();

        for (ListNode list:lists) {
            while(list != null){
                temp.add((list.val));
                list = list.next;
            }
        }

        Collections.sort(temp);

        for (Integer i:temp) {
            point.next = new ListNode(i);
            point = point.next;
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
