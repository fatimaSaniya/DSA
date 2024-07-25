package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Traversals {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    static int n;
    public static void main(String[] args){
        Node a = new Node(1); // a here is root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.print("Pre-Order: ");
        displayPreOrder(a);
        System.out.println();
        System.out.print("In-Order: ");
        displayInOrder(a);
        System.out.println();
        System.out.print("Post-Order: ");
        displayPostOrder(a);
        System.out.println();
        System.out.println("Level-Order: ");
        levelOrder(a);
        System.out.println();
        System.out.print("nth Level-Order: ");
        n=1;
        nthLevelOrder(a,0);
        System.out.println();
        for (int x = 0; x < 3; x++) {
            n= x;
            nthLevelOrder(a,0);
            System.out.println();
        }
    }
    private static void displayPreOrder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }
    private static void displayInOrder(Node root){
        if(root==null) return;
        displayInOrder(root.left);
        System.out.print(root.val + " ");
        displayInOrder(root.right);
    }
    private static void displayPostOrder(Node root)  {
        if(root==null) return;
        displayPostOrder(root.left);
        displayPostOrder(root.right);
        System.out.print(root.val + " ");
    }
    private static void levelOrder(Node root){
        int prevLevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0 ));
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(prevLevel!=lvl){
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val+ " ");
            if(temp.left!=null)q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }
    private static void nthLevelOrder(Node root, int level){
        if(root==null) return;
        if(n==level) System.out.print(root.val + " ");
        nthLevelOrder(root.left,level+1);
        nthLevelOrder(root.right, level+1);
    }
}
