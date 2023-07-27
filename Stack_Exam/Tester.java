package Stack_Exam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter size : ");
//		Stack stack=new Stack(sc.nextInt());
		
		Stack stack=new Stack(5);
		stack.push(new Students(1, "Shubham", 80));
//		stack.push(new Students(2, "Janmejay", 85));
//		stack.push(new Students(3, "Rahul", 89));
//		stack.push(new Students(4, "Ashutosh", 86));
		stack.display();
		
	}

}
