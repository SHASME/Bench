package Algorithms;

public class DetectLoop {
private ListNode head;

public static class  ListNode{
	private int data;
	private ListNode next;
	
	private  ListNode(int data) {
		this.data=data;
		this.next =null;
		
	}
}
public void insertBeginning(int data) {
	ListNode newNode = new ListNode (data);
	newNode.next = head;
	head=newNode;
}
public void printLinkedList() {
	if(head==null) {
		System.out.println("null");
	}
	ListNode current = head;
	while(null !=current) {
		System.out.println(current.data+" -> ");
		current =current.next;
	}
	System.out.println("null");
}
public boolean containsLoop(){
	ListNode fastPtr=head;
	ListNode slowPtr=head;
	
	while(fastPtr !=null && slowPtr !=null) {
		fastPtr=fastPtr.next.next;
		slowPtr=slowPtr.next;
		
		if(slowPtr==fastPtr) {
			return true;
			
		}
		
	}
	return false;
	}
public void createLoopInLinkedList() {
	ListNode first = new ListNode(10);
	ListNode second = new ListNode(10);
	ListNode third= new ListNode(10);
	ListNode fourth = new ListNode(10);
	ListNode fifth = new ListNode(10);
	ListNode sixth = new ListNode(10);
	ListNode seventh = new ListNode(10);
	
	head=first;
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=sixth;
    sixth.next=third;	
}
public static void main(String[] args) {
	DetectLoop sill = new DetectLoop();
	sill.createLoopInLinkedList();
	System.out.println(sill.containsLoop());
}
}
