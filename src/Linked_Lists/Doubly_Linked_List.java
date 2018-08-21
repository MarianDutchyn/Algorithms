package Linked_Lists;

import java.util.LinkedList;

public class Doubly_Linked_List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addToFront(T value){
        if (isEmpty()){
            Node<T> node = new Node<>(value, null, null);
            head = node;
            tail = node;
        }else {
            Node<T> node = new Node<>();
            node.setValue(value);
            head.setPrev(node);
            node.setNext(head);
            head = node;
        }
        size++;
    }
    public void addToEnd(T value){

        if (tail == null){
            Node node = new Node(value);
            head = node;
            tail = node;
        } else {
            Node node = new Node(value);
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;

    }
    public boolean addBefore(T value, T item){

        if (head == null) {
            return false;
        }
            Node current = head;
            while (current != null && !current.getValue().equals(item)){
                current = current.getNext();
            }
            if (current == null){
                return false;
            }
            Node newNode = new Node(value);
            newNode.setPrev(current.getPrev());
            newNode.setNext(current);
            current.setPrev(newNode);
        if (head == current){
            head = newNode;
        } else {
            newNode.getPrev().setNext(newNode);
        }
        size++;
        return true;
    }
    public Node removeFromFront(){
        if (head == null){
            return null;
        } else if (head.getNext() == null){
            head = null;
            tail = null;
            return head;
        } else {
            Node removeNode = head;
            head.getNext().setPrev(null);
            head = head.getNext();
            removeNode.setNext(null);
            size--;
            return removeNode;
        }
    }

    public Node removeFromEnd(){
        if (tail == null){
            return null;
        } else if (tail.getPrev() == null){
            head = null;
            tail = null;
            size--;
            return tail;
        }else {
            Node removeNode = tail;
            tail = tail.getPrev();
            removeNode.getPrev().setNext(null);
            removeNode.setPrev(null);
            size--;
            return removeNode;

        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        } else {
            return false;
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


    private static class Node<T> {
        T value;
        Node next;
        Node prev;

        public Node() {
        }

        public Node(T value){
            this.value = value;
        }

        public Node(T value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return  value + ", ";
        }
    }

}
