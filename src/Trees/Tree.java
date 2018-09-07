package Trees;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value){
        if (root != null){
          return  root.get(value);
        }
        return null;
    }

    public void delete(int value){
        if (root != null){
            root = delete(root, value);
        }
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if (subTreeRoot == null){
            return subTreeRoot;
        }

        if (value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild() ,value));
        }
        else if (value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }
        else {
            if (subTreeRoot.leftChild == null){
                return subTreeRoot.getRightChild();
            }
            else if (subTreeRoot.rightChild == null){
                return subTreeRoot.getLeftChild();
            }
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        return subTreeRoot;
    }

    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }


    private static class TreeNode{
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }

        public void insert(int value){
            if (value == data ){
                return;
            }
            if (value < data){
                if (leftChild == null){
                    leftChild = new TreeNode(value);
                } else {
                    leftChild.insert(value);
                }
            } else {
                if (rightChild == null){
                    rightChild = new TreeNode(value);
                } else {
                    rightChild.insert(value);
                }
            }
        }

        public TreeNode get(int value){
            if (value == data){
                return this;
            }
            if (value < data){
                if (leftChild != null){
                    return leftChild.get(value);
                }
            }else {
                if (rightChild != null){
                   return rightChild.get(value);
                }
            }
            return null;
        }

        public int min(){
            if (leftChild == null){
                return data;
            }
            else {
                return leftChild.min();
            }
        }

        public int max(){
            if (rightChild == null){
                return data;
            }
            else {
                return rightChild.max();
            }
        }

        public void traverseInOrder(){
            if (leftChild != null){
                leftChild.traverseInOrder();
            }
            System.out.print("Data = " + data + ", ");

            if (rightChild != null){
                rightChild.traverseInOrder();
            }
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Data = " + data;
        }
    }
}
