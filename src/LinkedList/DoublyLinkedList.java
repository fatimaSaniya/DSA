package LinkedList;

class dNode { //user defined data type
    int val;
    dNode next;
    dNode prev;
    dNode(int val) {
        this.val = val;
    }
}
class DLL{ //user defined data structure
     dNode head;
     dNode tail;
     int size;
     void display(){
         dNode temp = head;
         while(temp!=null){
             System.out.print(temp.val + " ");
             temp = temp.next;
         }
         System.out.println();
     }
     void insertAtTail(int val){
         dNode temp = new dNode(val);
         if(size==0) head = tail =temp;
         else {
             tail.next = temp;
             temp.prev = tail;
             tail = temp;
         }
         size++;
     }
     void insertAtHead(int val){
         dNode temp = new dNode(val);
         if(size==0) head = tail =temp;
         else {
             head.prev = temp;
             temp.next = head;
             head = temp;
         }
         size++;
     }
     void insertInBetween(int val, int idx){
         dNode temp = new dNode(val);
         if(idx == 0){
             insertAtHead(val);
             return;
         }
         if(idx == size){
             insertAtTail(val);
             return;
         }
         if(idx<0 || idx>size){
             System.out.println("Invalid index");
             return;
         }
         dNode x = head;
         for (int i=1;i<=idx-1;i++) {
             x = x.next;
         }
         dNode y = x.next;

         x.next = temp;
         temp.prev = x;
         temp.next = y;
         y.prev = temp;

         size++;
     }
}
public class DoublyLinkedList {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {
      DLL list = new DLL();
      list.insertAtTail(10);
      list.insertAtTail(20);
      list.insertAtTail(30);
      list.insertAtTail(40);
      list.display();
      list.insertAtHead(5);
      list.display();
      System.out.println(list.size);
      list.insertInBetween(25,3);
      list.display();
    }
}