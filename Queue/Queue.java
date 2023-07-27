package Queue;

public class Queue {
	private int size;
	private int arr[];
	private int rear,front;
	
	public Queue(int size) {
		this.size=size;
		arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	public boolean isEmpty()
	{
//		System.out.println("Queue is emptied");
		return rear== -1 && front == -1;
	}
	
	public boolean isFull() {		
//		System.out.println("Queue is full");
		return rear == size - 1;
	}
	
	//enqueue (insert operation)
//	public boolean insert(int data) {
//		if(isFull()) {	
//			System.out.println("Queue is full");
//			return false;
//		}
////		rear++;
//		arr[++rear]=data;
//		if(front == -1 )
//		{
//			front = 0 ;
//		}
//		return true;
//	}

	public boolean insert(int data) {
        if(isFull()) {
        	System.out.println("full queue");
            return false;
        }
        //rear++
//        arr[rear]=data;
        
        arr[++rear] = data;
        if(front == -1) {
            front = 0;
        }
        return true;
    }
//dequeue
	 public int delete() {
		 if(isEmpty()) {
			 System.out.println("empty queue");
			 return -1;
		 }
		 return arr[front++];
	 }
	
}
