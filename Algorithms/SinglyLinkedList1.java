package Algorithms;

public class SinglyLinkedList1 {
private ListNode head;

private static class ListNode{
	private int data;
	private ListNode next;
    
	private ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" -->");
			current=current.next;
		}
		System.out.println("null");
	}
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current= head;
		while(current !=null) {
			count++;
			current=current.next;
		}
		return count++;
	}
	public static void main(String[] args) {
		SinglyLinkedList1 sill = new SinglyLinkedList1();
		sill.head = new ListNode(20);
		ListNode second=new ListNode(25);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(24);
		sill.head.next=second;
		second.next=third;
		third.next=fourth;
		sill.display();
		System.out.println("Length is -->"+sill.length());
	}
}
