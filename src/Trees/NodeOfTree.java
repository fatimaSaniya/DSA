package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); // a here is root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g; e.right = h;
        display(a);
        System.out.println();
        System.out.println("Sum is: " +sum(a));
        System.out.println("Product is: "+ product(a));
        System.out.println("Maximum is: "+ max(a));
        System.out.println("Minimum is: "+ min(a));
        System.out.println("Size is: " + size(a));
        System.out.println("Level of tree is: "+ level(a));
    }
    private static void display(Node root){
        if(root==null) return; //base case
        System.out.print(root.val + "  ");
        display(root.left); //left subtree
        display(root.right); //right subtree
    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int max = Math.max(root.val, Math.max(max(root.left), max(root.right)));
        return max;
    }
    private static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int max = Math.min(root.val, Math.min(min(root.left), min(root.right)));
        return max;
    }
    private static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    
    private static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left) , level(root.right));
    }
}