package Customer_Exam;
public class Main {
    public static void main(String[] args) {
        // Creating the doubly linked list object
        DoublyLinkedList customerList = new DoublyLinkedList();

        // Adding customers to the list using Customer objects
        customerList.addCustomer(new Customer("Alice", 25, "alice@example.com"));
        customerList.addCustomer(new Customer("Bob", 30, "bob@example.com"));
        customerList.addCustomer(new Customer("Charlie", 22, "charlie@example.com"));

        // Displaying all customers in the list
        customerList.displayCustomers();
    }
}