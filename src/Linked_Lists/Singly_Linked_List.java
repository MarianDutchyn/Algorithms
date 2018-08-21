package Linked_Lists;

public class Singly_Linked_List<T> {

    private Node<T> head;
    private int size;

    public void addToFront(T value){
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else {
            return false;
        }
    }

    public void removeFromFront(){

        if (head.getNext() == null){
            head = null;
        }
        else {
            Node removeNode = head;
            head = head.getNext();
            removeNode.setNext(null);
            size--;
        }
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current);
            current = current.getNext();
        }
        System.out.println();
    }

    private static class Node<T>{
        T value;
        Node next;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return value + ", ";
        }
    }
}
