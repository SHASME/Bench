package Algorithms;

public class SinglyLinkedList3 {
private ListNode head;

public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data= data;
		this.next=null;
	}
}
public int length() {
	if(head==null) {
		return 0;
	}
	int count =0;
	ListNode current=head;
	while(current  !=null) {
		count++;
		current=current.next;
	}
	return count;
}
public void display (){
	ListNode current= head;
	while(current != null) {
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.println("null");
	}
public void insertFirst(int value) {
	ListNode newNode= new ListNode(value);
	newNode.next=head;
		head=newNode;
	}
public void insertLast(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		head=newNode;
		return;
	}
	ListNode current=head;
	while(null !=current.next) {
		current=current.next;
	}
	current.next=newNode;
}
public ListNode deleteFirst() {
	if(head==null) {
		return null;
	}
	ListNode temp=head;
	head=head.next;
	temp.next=null;
	return temp;
}
public ListNode deleteLast() {
	if(head== null || head.next==null) {
		return head;
	}
	ListNode current = head;
	ListNode previous=null;
	
	while(current.next !=null) {
		previous=current;
		current=current.next;
	}
	previous.next=null;
	return current;
	}
public static void main(String[] args) {
	SinglyLinkedList3 sill=new SinglyLinkedList3();
	sill.insertLast(10);
	sill.insertLast(20);
	sill.insertLast(25);
	
	sill.display();
//    System.out.println(sill.deleteFirst().data);
//    System.out.println(sill.deleteFirst().data);
//    System.out.println(sill.deleteFirst().data);
	
	 System.out.println(sill.deleteLast().data);
	 System.out.println(sill.deleteLast().data);
	 System.out.println(sill.deleteLast().data);
     sill.display();
}
}


