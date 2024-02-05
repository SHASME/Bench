package Algorithms;

public class InsertGivenPosition {
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
	 ListNode current=head;
	 while(current !=null) {
		 System.out.print(current.data +" ->");
		 current = current.next;
	 }
	 System.out.println("null");
 }
 
 public void Insert(int position, int value) {
	 ListNode node = new ListNode(value);
	 if(position == 1) {
		 node.next=head;
		 head=node;
	 }else {
		 ListNode previous = head;
		 int count=1;
		 while(count<position -1) {
			 previous =previous.next;
			 count++;
		 }
		 ListNode current=previous.next;
		 previous.next=node;
		 node.next=current;
	 }
 }
 public static void main(String[] args) {
	InsertGivenPosition sill = new InsertGivenPosition();
	sill.Insert(1,3);
	sill.Insert(2,4);
	sill.Insert(3,5);
	sill.Insert(4,8);
	sill.Insert(3,9);
	
	sill.display();
	}
}

