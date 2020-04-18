import java.util.LinkedList;

public class ListNode {
	
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	public static void main(String args[]) {
		
		LinkedList<Integer> firstLinkedList = new LinkedList<Integer>();
		LinkedList<Integer> secondLinkedList = new LinkedList<Integer>();
		
		firstLinkedList.addFirst(1);
		firstLinkedList.add(2);
		firstLinkedList.addLast(4);
		
		secondLinkedList.addFirst(1);
		secondLinkedList.add(3);
		secondLinkedList.addLast(4);
		
		//mergeTwoLists(firstLinkedList, secondLinkedList);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
        
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            }else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        
        if(l1 != null) {
            dummy.next = l1;
        }else {
            dummy.next = l2;
        }
        
        return head.next;
    }
}
