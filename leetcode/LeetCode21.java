package leetcode;

public class LeetCode21 {

    public static void main(String[] args) {
                    
    }


    public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {

        ListNode temp = new ListNode();
        ListNode ans = temp;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                ans.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                ans.next = listNode2;
                listNode2 = listNode2.next;
            }

            ans = ans.next;
        }

        if (listNode1 != null) {
            ans.next = listNode1;
            listNode1 = listNode1.next;
            ans = ans.next;
        }

        if (listNode2 != null) {
            ans.next = listNode2;
            listNode2 = listNode2.next;
            ans = ans.next;
        }
        
        return temp.next;
    }
}