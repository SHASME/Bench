package Algorithms;

public class RemoveDuplicates {
private ListNode head;

public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next = null;
	}
	
	}
public void insertBeginning(int data) {
	ListNode newNode = new ListNode(data);
	newNode.next=head;
	head= newNode;
}
public void printLinkedList() {
	if(head==null) {
		System.out.println("null");
	}
	ListNode current = head;
	while(null != current) {
		System.out.print(current.data+" -> ");
		current=current.next;
	}
	System.out.println("null");
}
public void removeDuplicate() {
	if(head==null) {
		return;
		
	}
	ListNode current = head;
	while(current !=null && current.next !=null) {
		if(current.data == current.next.data) {
			current.next =current.next.next;
		}else {
			current =current.next;
		}
	}
}
public static void main(String[] args) {
	RemoveDuplicates sill = new RemoveDuplicates();
	sill.insertBeginning(40);
	sill.insertBeginning(25);
	sill.insertBeginning(25);
	sill.insertBeginning(25);
	sill.insertBeginning(20);
	
	sill.printLinkedList();
	sill.removeDuplicate();
	sill.printLinkedList();
}
}
