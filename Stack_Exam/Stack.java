package Stack_Exam;

import java.util.Arrays;

public class Stack {
	private int size;
	private int top;
	private Students [] arr;
	
	public Stack(int size) {
		this.size=size;
		this.top=-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==(size-1);
	}
	
	public boolean push(Students student) {
		if(isFull()) {
			return false;
		}
		arr[++top]=student;
		return true;
	}
	
	public Students pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];
	}
	public Students peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
	public void display() {
		System.out.print(Arrays.toString(arr));
	}
}
