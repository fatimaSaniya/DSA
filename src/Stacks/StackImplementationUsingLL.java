package Stacks;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }

}

class StackLL{
    private Node head;
    private int size = 0;

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int size(){
        return size;
    }
    int pop(){
        if(head == null){
            System.out.print("Stack is empty! ");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        if(head == null){
            System.out.print("Stack is empty! ");
            return -1;
        }
        int x = head.val;
        return x;
    }
    boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    void display(){
        System.out.print("Stack: ");
        displayRec(head);
        System.out.println();
    }
    void displayRec(Node h){
        if( h == null) return;
        displayRec(h.next);
        System.out.print(h.val + " ");
    }
}
 public class StackImplementationUsingLL {
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element:" + st.peek());
        System.out.println("Size is:" + st.size());
        st.push(40);
        st.push(50);
        st.display();
        st.push(60);
        st.display();
        System.out.println("Popped element: " + st.pop());
        System.out.println("Size is:" + st.size());
        System.out.println(st.isEmpty());
    }
}
