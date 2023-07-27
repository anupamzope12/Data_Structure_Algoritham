package Queue;

public class Main {
	public static void main(String[] args) {
		
	Queue q =new Queue(5);
	
	System.out.println("ins " + q.insert(10));
	System.out.println("ins " + q.insert(20));
	System.out.println("ins " + q.insert(30));
	
	System.out.println("del " + q.delete());
	System.out.println("del " + q.delete());
	System.out.println("del " + q.delete());
	
	System.out.println("ins " + q.insert(40));
	System.out.println("del " + q.delete());
	
	}
}
