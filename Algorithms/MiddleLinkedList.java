package Algorithms;

public class MiddleLinkedList {
private ListNode head;

public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=null;
		
	}
}
public void insertBeginning(int data) {
	ListNode newNode = new ListNode(data);
	newNode.next = head;
	head= newNode;
}
public void printLinkedList() {
	if(head==null) {
		System.out.println("null");
	}
	ListNode current = head;
	while(current != null) {
		System.out.print(current.data+" ->");
		current = current.next;
	}
	System.out.println("null");
}
public ListNode getMiddleNode() {
	if(head==null) {
		return null;
	}
	ListNode slowPtr = head;
	ListNode fastPtr = head;
	while(fastPtr !=null && fastPtr.next != null) {
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
	}
	return slowPtr;
}
public static void main(String[] args) {
	MiddleLinkedList sill = new MiddleLinkedList();
	sill.insertBeginning(10);
	sill.insertBeginning(20);
	sill.insertBeginning(40);
	sill.insertBeginning(50);
	sill.insertBeginning(13);
	
	sill.printLinkedList();
	
	ListNode middleNode = sill.getMiddleNode();
	System.out.println("Middle node is - > "+ middleNode.data);
}
}
