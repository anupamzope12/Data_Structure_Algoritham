package Stack1;

public class Main {
	public static void main(String[] args) {
	Stack s=new Stack(5);
	
	System.out.println("inst	" + s.push(10));
	System.out.println("inst	" + s.push(20));
	System.out.println("inst	" + s.push(30));
	System.out.println("inst	" + s.push(40));
	System.out.println("inst	" + s.push(50));
	
	s.pop();
	s.pop();
	
	System.out.println(" empty	 " + s.isEmpty() + "	full " + s.isFull());
	
	s.printstack();
	}
}
