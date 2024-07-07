
/*  check if a binary tree is univalued or not 
    we have a binary tree , the task is to check if the binary tree is univalued or not . if found to be true , then print " YES". otherwise, print "NO".
*/
import java.util.*;

public class checkUnivalued {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return (temp);
    }

    static boolean isUnivalTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(1);
        root.right = newNode(1);
        root.left.left = newNode(1);
        root.left.right = newNode(1);
        root.right.left = newNode(1);
        root.right.right = newNode(1);

        if (isUnivalTree(root)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
