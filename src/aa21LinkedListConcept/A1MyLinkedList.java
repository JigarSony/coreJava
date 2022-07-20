package aa21LinkedListConcept;

public class A1MyLinkedList {
	
	Node head;
	//creating own linkedList
	class Node {
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	//Printing Linked list
	public void printLinedList() {
		Node n = head;
		
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		
		A1MyLinkedList ll = new A1MyLinkedList();
		
		Node first = ll.new Node(10);
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next = second;
		
		Node third = ll.new Node (30);
		second.next = third;
		
		ll.printLinedList();
		/*
		 * 10
		 * 20
		 * 30
		 */
		
	}

}
