package Trees;

public class Main {
    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(20);
        intTree.insert(22);
        intTree.insert(12);
        intTree.insert(15);
        intTree.insert(31);
        intTree.insert(4);

        intTree.traverseInOrder();
        System.out.println();

        System.out.println(intTree.get(4));
        System.out.println(intTree.get(22));

        System.out.println("GET MIN VALUE FROM TREE: " + intTree.min());
        System.out.println("GET MAX VALUE FROM TREE: " + intTree.max());

        intTree.delete(12);
        intTree.traverseInOrder();

    }
}
