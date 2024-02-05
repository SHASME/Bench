package Algorithms;

public class FindStartOfALoop {
	
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
		ListNode newNode = new ListNode (data);
		newNode.next = head;
		head= newNode;
	}
	public void printLinkedList() {
		if(head==null) {
			System.out.println("null");
		}
		ListNode current = head;
		while(null !=current) {
			System.out.print(current.data+" ->");
			current=current.next;
		}
		System.out.println("null");
	}
	public boolean containsLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr !=null && fastPtr.next !=null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr) {
				return true;
			}
		}
		return false;
	}
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(11);
		ListNode third= new ListNode(10);
		ListNode fourth = new ListNode(13);
		ListNode fifth= new ListNode(15);
		ListNode sixth = new ListNode(14);
	
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
	}
	public ListNode StartNodeInALoop() {
		ListNode fastPtr = head;
		ListNode slowPtr=head;
		while(fastPtr !=null && fastPtr.next !=null) {
			fastPtr=fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}
	private ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while(temp !=slowPtr) {
			temp=temp.next;
			slowPtr=slowPtr.next;
		}
		return temp;
	}
	public static void main(String[] args) {
		FindStartOfALoop sill = new FindStartOfALoop();
		sill.createALoopInLinkedList();
		System.out.println(sill.containsLoop());
		System.out.println(sill.StartNodeInALoop().data);
	}
	
}
