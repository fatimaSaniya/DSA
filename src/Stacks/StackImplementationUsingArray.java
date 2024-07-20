package Stacks;

class Stack{
    private int []arr = new int[5];
    private int idx = 0;

    void push(int x){
        if(isFull()){
            System.out.println("Stack is full!!");
            return;
        }
        arr[idx] = x;
        idx++;
    }
    int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty!!");
            return -1;
        }
        return arr[idx-1];
    }
    int pop()   {
        if(isEmpty()){
            System.out.print("Stack is empty!!");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    void display(){
        System.out.print("Stack: ");
        for (int i = 0; i < idx ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx == arr.length) return true;
        else return false;
    }
}
public class StackImplementationUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push(40);
        st.push(50);
        st.display();
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
