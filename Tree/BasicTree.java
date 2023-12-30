package linkedlist.com;

class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }


}

class Tree {
    void preOrderTraversal(Node1 root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    void InOrderTraverse(Node1 root) {
        if (root != null) {
            InOrderTraverse(root.left);
            System.out.print(root.data + " ");
            InOrderTraverse(root.right);
        }
    }

    int HeightOfBinaryTree(Node1 root) {
        if (root == null) return 0;
        else {
            int left = HeightOfBinaryTree(root.left);
            int right = HeightOfBinaryTree(root.right);
            return Math.max(left, right) + 1;
        }

    }

    int CountNo_ofNode(Node1 root) {
        if (root == null) return 0;
        else {
            int left = CountNo_ofNode(root.left);
            int right = CountNo_ofNode(root.right);
            return left + right + 1;
        }
    }
}
    public class treeByRaushanSir {
        public static void main(String[] args) {
            Tree tt = new Tree();
            Node1 tr = null;
            tr = new Node1(5);
            tr.left = new Node1(10);
            tr.right = new Node1(20);
            tr.left.left = new Node1(30);
            tr.left.right = new Node1(40);
            tr.right.left = new Node1(50);
            tr.right.right = new Node1(50);

            tt.preOrderTraversal(tr);
            System.out.println();

            tt.InOrderTraverse(tr);
            System.out.println();
            int ans = tt.HeightOfBinaryTree(tr);

            System.out.println("Length is Calculated by Raushan Sir " + ans);

            System.out.println(tt.CountNo_ofNode(tr));


        }
    }

