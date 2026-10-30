
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        int size = 1;

        while (curr != null) {
            ListNode start = curr;
            int count = 0;

            // Find group length
            while (count < size && curr != null) {
                curr = curr.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode node = start;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }

                if (start == head) {
                    head = prev;
                } else {
                    ListNode temp = head;
                    while (temp.next != start) {
                        temp = temp.next;
                    }
                    temp.next = prev;
                }

                start.next = curr;
                prev = start;
            } else {
                prev = start;
                while (prev.next != curr) {
                    prev = prev.next;
                }
            }

            size++;
        }

        return head;
    }
}
