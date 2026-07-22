class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Delete {

    static Node insert(Node root, int val) {

        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    static Node delete(Node node, int key) {

        if (node == null)
            return null;

        if (key < node.val)
            node.left = delete(node.left, key);

        else if (key > node.val)
            node.right = delete(node.right, key);

        else {

            if (node.left == null && node.right == null)
                return null;

            if (node.left == null)
                return node.right;

            if (node.right == null)
                return node.left;

            Node successor = node.right;

            while (successor.left != null)
                successor = successor.left;

            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }

        return node;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        root = delete(root, 70);

        inorder(root);
    }
}
