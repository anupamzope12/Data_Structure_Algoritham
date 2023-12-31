package DoublyLinkedLIst;

public class Node {
	private int data;
	private Node next;
	public void setNext(Node next) {
		this.next = next;
	}

	private Node prev;
	
	public Node(int data) {
		super();
		this.data = data;
		prev=next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setLast(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	
}