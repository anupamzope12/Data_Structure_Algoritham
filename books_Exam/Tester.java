package books_Exam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SingilyLinkedList sl=new SingilyLinkedList();
		int ch;
		do {
			System.out.println("Choose option");
			System.out.println("1.Display Books");
			System.out.println("2.Add book");
			System.out.println("3.Total books count");
			System.out.println("4.Insert at last");
			System.out.println("5.Insert at front");
			System.out.println("6.Delete at end");
			System.out.println("7.Delete at front");
			System.out.println("8.Delete at position");
			System.out.println("9.Insert at position");
			System.out.println("10.Search by Book Title");
			System.out.println("11.Sort in descending order of book id");
			System.out.println("Exit");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: sl.display();    break;
			case 2: System.out.println("Enter Book id,name,author name,price"); 
				System.out.println(sl.insertAtEnd(new Books(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble())));
				break;
			case 3: System.out.println("Total book count : "+sl.count());    break;
			case 4: System.out.println("Enter Book id,name,author name,price"); 
			System.out.println(sl.insertAtEnd(new Books(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble())));    break;
			case 5: System.out.println("Enter Book id,name,author name,price"); 
			System.out.println(sl.insertAtFront(new Books(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble())));    break;
			case 6:  
				System.out.println(sl.deleteAtEnd());   break;
			case 7:  System.out.println(sl.deleteAtFront());   break;
			case 8: sl.deleteByPos(sc.nextInt())   ; break;
			case 9: System.out.println("Enter Book id,name,author name,price and position"); 
			System.out.println(sl.insertByPos(new Books(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()), sc.nextInt()));    break;
			case 10: System.out.println("Enter Book Name : ");
				System.out.println(sl.searchByBookName(sc.next()));
			break;
			case 11: sl.sortBooks();    break;
			case 0:  System.out.println("Exiting...");   break;
			default: System.out.println("Enter valid choice");
				break;
			}
			
		}while(ch!=0);
	}

}
