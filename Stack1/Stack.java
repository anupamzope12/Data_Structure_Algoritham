package Stack1;

public class Stack {
	public int arr[];
	public int size;
	public int top;
	
	public Stack(int size) {
		this.size=size;
		this.top = -1;
		arr=new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean push(int data) {
		if(isFull()){
			return false;
		}
		arr[++top]=data;
		return true;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
//			return false;
		}
		return arr[top--];
	}
//	Stack s;
	public void printstack() {
		for(int i=0 ; i<=top ; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
