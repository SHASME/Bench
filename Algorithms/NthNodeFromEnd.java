package Algorithms;

public class NthNodeFromEnd{
private ListNode head;

public static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data){
	this.data=data;
	this.next=null;
	}
}
public void insertBeginning(int data) {
	ListNode newNode = new ListNode(data);
	newNode.next = head;
	head =newNode;
}
public void printLinkedList(){
	if(head==null) {
		System.out.println("null");
	}
	ListNode current= head;
	while(current != null) {
		System.out.print(current.data+" ->");
		current=current.next;
	}
	System.out.println("null");
}
public ListNode getNthNodeFromEnd(int n) {
	if(head==null) {
		return null;
	}
	if(n<=0) {
		throw new IllegalArgumentException("Invalid value : n =" + n);
	}
	ListNode mainPtr=head;
	ListNode refPtr = head;
	int count =0;
  while(count<n) {
	  if(refPtr ==null) {
		  throw new IllegalArgumentException(  n+" is greater than the number of nodes in list");
	  }
	  refPtr=refPtr.next;
	  count ++;
  }
  while(refPtr !=null) {
	  refPtr = refPtr.next;
	  mainPtr = mainPtr.next;
  }
  return mainPtr;
}
public static void main(String[] args) {
	NthNodeFromEnd sill  = new NthNodeFromEnd();
	sill.insertBeginning(20);
	sill.insertBeginning(22);
	sill.insertBeginning(34);
	sill.insertBeginning(17);
	sill.insertBeginning(57);
	
	sill.printLinkedList();
	ListNode nthNodeFromEnd = sill.getNthNodeFromEnd(5);
	//ListNode nthNodeFromEnd = sill.getNthNodeFromEnd(2);
	//ListNode nthNodeFromEnd = sill.getNthNodeFromEnd(2);
	System.out.println("Nth node from end is  ->"+nthNodeFromEnd.data);
}
}
