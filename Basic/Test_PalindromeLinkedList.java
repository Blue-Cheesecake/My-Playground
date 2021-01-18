// ! CAUTION ! --> This is BAD SOLUTION

package Basic;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class PalindromLinkedList {

    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode cur = head;

        while (cur != null) {

            arr.add(cur.val);
            cur = cur.next;

        }

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {

            if (!(arr.get(left).equals(arr.get(right)))) {
                return false;
            }
            left += 1;
            right -= 1;
        }

        return true;
    }

}
