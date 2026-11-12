class Solution {
    public int getDecimalValue(ListNode head) {

        int decimal = 0;
        ListNode curr = head;

        while (curr != null) {
            decimal = decimal * 2 + curr.val;
            curr = curr.next;
        }

        return decimal;
    }
}