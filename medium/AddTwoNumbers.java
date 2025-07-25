/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Dummy node to help build the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;//pointer to new the new list
        int carry = 0; // To keep track of carray from each digit sum 

        //Traverse both lists until both are null
        while (l1 != null || l2 != null) {
            //Get values from current nodes or 0 if null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y; //Add  current digit and carry
            carry = sum / 10; //Compute new carry means upade carry
            current.next = new ListNode(sum % 10); //Add current digit to result

            current = current.next; //Move to the next node

            //Advance l1 and l2 if possible
            if (l1 != null) l1 = l1.next; //move l1 for ward
            if (l2 != null) l2 = l2.next; //move l2 forward
        }

        //If there is carry left, add it asa new node 
        if (carry > 0){
            current.next = new ListNode(carry); //Handle left over carry
        }

        // Return the next of dummy node which is the actual head
        return dummyHead.next;
        
    }
}