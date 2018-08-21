package Linked_Lists;

public class Main {

    public static void main(String[] args) {
/*
        Singly_Linked_List<String> singly_linked_list = new Singly_Linked_List<>();
        System.out.println(singly_linked_list.isEmpty());
        singly_linked_list.addToFront("First");
        singly_linked_list.addToFront("Second");
        singly_linked_list.addToFront("Third");
        System.out.println(singly_linked_list.size());
        singly_linked_list.printList();
        singly_linked_list.removeFromFront();
        System.out.println(singly_linked_list.size());
*/
        Doubly_Linked_List<String> doubly_linked_list = new Doubly_Linked_List<>();
        System.out.println(doubly_linked_list.isEmpty());
        System.out.println(doubly_linked_list.size());
        doubly_linked_list.addToFront("First");
        doubly_linked_list.addToFront("Second");
        doubly_linked_list.addToFront("Third");
        doubly_linked_list.addToEnd("Last");
        doubly_linked_list.printList();
        System.out.println("=====");
        doubly_linked_list.removeFromFront();
        doubly_linked_list.removeFromFront();
        doubly_linked_list.addBefore("XXX", "Last");
        doubly_linked_list.removeFromEnd();
        doubly_linked_list.printList();
        System.out.println(doubly_linked_list.size());
        System.out.println(doubly_linked_list.isEmpty());

    }
}
