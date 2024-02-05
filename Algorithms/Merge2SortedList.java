package Algorithms;

public class Merge2SortedList {
private ListNode head; 

public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public void display() {
	ListNode current = head;
	while(current !=null) {
		System.out.print(current.data+" -> ");
		current=current.next;
	}
	System.out.println("null");
}
public void insertLast(int value) {
	ListNode newNode = new ListNode(value);
	if(head==null) {
		head=newNode;
		return;
	}
	ListNode current = head;
	while(null !=current.next) {
	current = current.next;
}
	current.next=newNode;
}
public static ListNode merge(ListNode a, ListNode b) {
	ListNode dummy = new ListNode(1);
	ListNode tail=dummy;
	while(a !=null && b !=null) {
		if(a.data <= b.data) {
			tail.next = a;
		   a=a.next;
		}else {
			tail.next = b;
			b=b.next;
		}
		tail =tail.next;
	}
	if(a==null) {
		tail.next = b;
	}else {
		tail.next=a;
	}	
	return dummy;
}
public static void main(String[] args) {
	Merge2SortedList sill = new Merge2SortedList();
	sill.insertLast(10);
	sill.insertLast(11);
	sill.insertLast(12);
	sill.insertLast(13);
	sill.insertLast(14);
 
	Merge2SortedList sill2 = new Merge2SortedList();
	sill2.insertLast(20);
	sill2.insertLast(21);
	sill2.insertLast(22);
	sill2.insertLast(23);
	sill2.insertLast(25);
	
	sill.display();
	sill2.display();
	
	Merge2SortedList result = new Merge2SortedList();
	result.head=merge(sill.head, sill2.head);
	result.display();
}
}