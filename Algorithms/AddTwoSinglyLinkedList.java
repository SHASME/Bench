package Algorithms;

public class AddTwoSinglyLinkedList {
private ListNode head;
public static class ListNode{
	public static final int val = 0;
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public void display() {
	ListNode current =head;
	while(current !=null) {
		System.out.print(current.data+ " ->");
		current = current.next;
	}
	System.out.println("null");
}
public void InsertFirst(int value) {
	ListNode newNode = new ListNode(value);
	newNode.next = head;
	head = newNode;
}
public static ListNode add(ListNode a, ListNode b) {
 ListNode dummy = new ListNode(0);
ListNode tail=dummy;
int carry =0;
while(a !=null || b !=null) {
	int x =(a !=null)  ? a.val : 0 ;
  int y=(b !=null) ? b.val:0;
  int sum = carry+x+y;
 carry=sum/10;
 tail.next=new ListNode(sum %10);
 tail=tail.next;
 if(a !=null) a=a.next;
 if(b !=null)b = b.next;
}
if(carry >0) {
	tail.next = new ListNode(carry);
}
 return dummy.next;
	
}
public static void main(String[] args) {
	AddTwoSinglyLinkedList list = new AddTwoSinglyLinkedList();
	list.InsertFirst(2);
	list.InsertFirst(11);
	list.InsertFirst(3);
	list.InsertFirst(21);
	
	AddTwoSinglyLinkedList list2 = new AddTwoSinglyLinkedList();
	list2.InsertFirst(20);
	list2.InsertFirst(1);
	list2.InsertFirst(23);
	list2.InsertFirst(21);
	
	list.display();
	list2.display();
	
	AddTwoSinglyLinkedList result = new AddTwoSinglyLinkedList();  
	result.head=add(list.head, list2.head);
	result.display();
			}
}
