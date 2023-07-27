package books_Exam;

import java.util.ArrayList;
import java.util.List;

public class SingilyLinkedList {
	private Node head;
	public SingilyLinkedList() {
		this.head=null;
	}
	
	public boolean insertByPos(Books book ,int pos) {
		
		Node newNode=new Node(book);
		if(newNode==null){
			return false;
		}
		if (pos==1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			newNode.setNext(newNode);
			head=newNode;
			return true;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.getNext();
		}
		Node next=prev.getNext();
		newNode.setNext(next);
		prev.setNext(newNode);
		return true;
	}
	
	public boolean insertAtFront(Books book) {
		Node newNode=new Node(book);
		if(newNode==null){
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		newNode.setNext(head);
		head=newNode;
		return true;
	}
	

	
	public boolean insertAtEnd(Books book) {
		Node newNode=new Node(book);
		if(newNode==null){
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		return true;
	}
	public void display() {
		if(head==null) {
			return;
		}
		Node last=head;
		while(last!=null) {
			System.out.println(last.getBook());
			last=last.getNext();
		}
	}
	public int count() {
		if(head==null) {
			return 0;
		}
		int c=0;
		Node last=head;
		while(last!=null) {
			c++;
			last=last.getNext();
		}
		return c;
	}
	public boolean deleteAtEnd() {
		if(head==null) {
			return false;
		}
		Node prev=head;
		Node del=head;
		while(del.getNext()!=null) {
			prev=del;
			del=del.getNext();
		}
		
		prev.setNext(del.getNext());
		return true;
	}
	public boolean deleteAtFront() {
		if(head==null) {
			return false;
		}
		Node temp=head;
		head=temp.getNext();
		temp.setNext(null);
		return true;
	}
	public boolean deleteByPos(int pos) {
		if(pos<=0 && (head==null && pos>1)) {
			return false;
		}
		if(pos==1) {
			if(head==null) {
				return false;
			}
			Node temp=head;
			head=temp.getNext();
			temp.setNext(null);
			return true;
		}
		Node prev=head;
		Node del=head;
		for(int i=0;i<pos-1;i++) {
			prev=del;
			del=del.getNext();
		}
		if(del==null) {
			return false;
		}
		prev.setNext(del.getNext());
		return true;
		
	}
	
	public Books searchByBookName(String name) {
		if(head==null) {
			return null;
		}
		if(head.getBook().getBookName().equals(name)) {
			return head.getBook();
		}
		Node temp=head;
		while(temp.getBook().getBookName().equals(name)) {
			temp=temp.getNext();
		}
		if(temp==null) {
			return null;
		}
		return temp.getBook();
	}
	
	public void sortBooks() {
		if(head==null) {
			return;
		}
		List<Books> list=new ArrayList<>();
//		Stack<Books> stack= new Stack<>();
		int count=0;
		Node temp=head;
		while(temp.getNext()!=null) {
			list.add(temp.getBook());
//			stack.push(temp.getBook());
//			count++;
			temp=temp.getNext();
		}
		list.stream().sorted((a,b)->Integer.compare(a.getBookId(), b.getBookId())).forEach((b)->System.out.print("Id="+b.getBookId()+" "+" Name="+b.getBookName()+" Author="+b.getBookAuthor()+" Price="+b.getPrice()));
//		for(int i=0;i<=count;i++) {
//			System.out.println(stack.pop().toString());
//		}
	}
	
	
}


















