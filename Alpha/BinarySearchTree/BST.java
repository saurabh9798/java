import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // build a bst
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // delete a node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 - leaf child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 both children
            // Node IS = findInorderDSucceser(root.right);
            Node IS = findInorderDSucceser(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static Node findInorderDSucceser(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print in range
    public static void PrintInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && k2 >= root.data) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (k2 < root.data) {
            PrintInRange(root.left, k1, k2);
        } else {
            PrintInRange(root.right, k1, k2);
        }
    }

    // root to leaf paths
    public static void printpath(ArrayList<Integer>path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRootToPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        }
        printRootToPath(root.left, path);
        printRootToPath(root.right, path);
        path.remove(path.size()-1);

    }

    // valid BST   
    public static boolean isValidBST(Node root,Node min,Node max)
    {
        if (root== null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
            inorder(root);
            System.out.println();


        if (isValidBST(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
        // printRootToPath(root, new ArrayList<>());
        /*
       
         * PrintInRange(root, 5, 12);
         */
        /*
         * root = delete(root, 1);
         * System.out.println();
         * inorder(root);
         */

        // System.out.println();
        // if (search(root, 5)) {
        // System.out.println("found");
        // } else {
        // System.out.println("not found ");
        // }
    }
}