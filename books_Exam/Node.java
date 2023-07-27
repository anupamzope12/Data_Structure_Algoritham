package books_Exam;

public class Node {
	private Books book;
	private Node next;
	public Node() {
		book=null;
		next=null;
	}
	public Node(Books book) {
		this.book=book;
		this.next=null;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
