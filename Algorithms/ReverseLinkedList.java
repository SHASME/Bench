package Algorithms;

public class ReverseLinkedList {
private ListNode head;

public static class ListNode{
	private int data;
	private ListNode next;
	
	private ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public void display(ListNode head) {
	ListNode current= head;
	while(current != null) {
		System.out.print(current.data+" ->");
		current=current.next;
	}
	System.out.println("null");
}
public ListNode reverse(ListNode head) {
	if(head==null) {
		return head;
	}
	ListNode current = head;
	ListNode previous= null;
	ListNode next = null;
	
	while(current !=null) {
		next = current.next;
		current.next=previous;
		previous =current;
		current=next;
	}
	return previous;
}
public static void main(String[] args) {
	ListNode head = new ListNode(10);
	ListNode second = new ListNode(29);
	ListNode third=new ListNode(30);
	ListNode fourth = new ListNode(40);
	
	head.next=second;
	second.next = third;
	third.next=fourth;
	
	ReverseLinkedList reverseLinkedList= new ReverseLinkedList();
	reverseLinkedList.display(head);
	
	ListNode reverseHead =reverseLinkedList.reverse(head);
	reverseLinkedList.display(reverseHead);
}
}
