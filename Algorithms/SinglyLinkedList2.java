package Algorithms;

public class SinglyLinkedList2 {
 private ListNode head;
 
 public static class ListNode{
	 private int data;
	 private ListNode next;
	 
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
 }
  public int length() {
	  if(head==null) {
		  return 0;
	  }
	  int count = 0;
	  ListNode current = head;
	  while(current !=null) {
		  count++;
		  current=current.next;
	  }
	  return count;
  }
  public void display() {
	  ListNode current = head;
	  while(current !=null) {
		  System.out.print(current.data +"  -->");
		  current= current.next;
	  }
	  System.out.println("null");
  }
  public void insertFast(int value) {
	  ListNode newNode = new ListNode(value);
	  newNode.next=head;
	  head=newNode;
  }
  public void insertLast(int value) {
	  ListNode newNode= new ListNode(value);
	  if(head==null) {
		  head=newNode;
		  return;
	  }
	  ListNode current= head;
	  while(null !=current.next) {
		  current = current.next;
	  }
	  current.next = newNode;
	  }
  public static void main(String [] args) {
	  SinglyLinkedList2 sill = new SinglyLinkedList2();
     sill.insertLast(20);  
     sill.insertLast(22); 
     sill.insertLast(23); 
     sill.insertLast(29);
     sill.insertLast(30);
     sill.display();
     System.out.println("Length is----->"+sill.length());
     
  }
}
