import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data;
        Node next;
        // Constructor 
        Node(int d) 
        {  
            this.data=d;//Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node n= new Node(data);
        
        if (list.head == null)
        {
            list.head=n;
            return list;
        }

        Node nod = list.head;
        while (nod.next!=null){
            nod =nod.next;
        }
        nod.next=n;
        return list;
        
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node noddy = list.head;
        if( noddy == null){
            System.out.println(" LinkedList Empty ");
        }

        while (noddy != null){
            System.out.println(noddy.data + " ");
            noddy=noddy.next;
        }
        // Traverse through the LinkedList 
        System.out.println(" ");
            // Print the data at current node 
       
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
