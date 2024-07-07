
public class height {
    static class Node {
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int heightoftree(Node root)
    {
        if (root==null) {
            return 0;
        }
        int lh =heightoftree(root.left);
        int rh = heightoftree(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = countNode(root.left);
        int rightcount = countNode(root.right);
        return leftcount+rightcount+1;
    }
    public static int sum(Node root) // O(n)
    {
        if (root == null) {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls + rs + root.data;
    }
    // dimeter of tree O(n^2) approch 1

    public static int diameter(Node root) 
    {
        if (root == null) {
            return 0;
        }

        int leftD =diameter(root.left);
        int leftHt = heightoftree(root.left);
        int rightD = diameter(root.right);
        int rightHT = heightoftree(root.right);

        int seftDiam = leftHt+rightHT+1;

        return Math.max(seftDiam, Math.max(leftD, rightD));

    }
    // dimeter of tree O(n) approch 2
    static class Info {
        int diam;
        int ht;

        public Info(int diam,int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root)
    {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);

    }
    public static void main(String[] args) {
        /*
         * height of binary tree
         *                1
         *               / \
         *              2   3
         *             /\   /\
         *            4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("height of tree : "+heightoftree(root));
        System.out.println("total nummber of node in tree : "+countNode(root));
        System.out.println("total sum of binary tree : "+sum(root));
        System.out.println("diameter of tree : "+ diameter(root));
        System.out.println("diameter2 of tree : "+ diameter2(root).diam);
    }
}
