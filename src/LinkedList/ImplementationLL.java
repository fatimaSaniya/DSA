package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtBeginning(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertInBetween(int idx, int val) {
        if (idx == 0) {
            insertAtBeginning(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx > size) {
            System.out.println("Index out of bound!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) x = x.next;
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int idx) {
        if (idx == size - 1) return tail.val;
        if (idx > size || idx < 0) {
            System.out.println("Index out of bound!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) temp = temp.next;
        return temp.val;
    }
    void delete(int val) {
        if (head == null) System.out.println("Empty list");
        else {
            Node temp = head;
            Node a = null;
            while (temp.val != val) {
                a = temp;
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Value not present");
            } else {
                a.next = temp.next;
            }
        }
        size--;
    }
    void MergeTwoSortedList(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            System.out.println("No list exist");
            return;
        }
        Node dummy = new Node(0);
        Node current = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }
        if (temp1 != null) {
            current.next = temp1;
        } else {
            current.next = temp2;
        }
        Node printNode = dummy.next;
        while (printNode != null) {
            System.out.print(printNode.val + " ");
            printNode = printNode.next;
        }
        System.out.println();
    }
    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }
        head = prev;
    }

    Node deleteMiddle() {
        if (head.next == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 = 0, val2 = 0;
            if(l1!=null) val1 = l1.val;
            if(l2!=null) val2 = l2.val;
            int num = val1  + val2 + carry;
            Node node = new Node(num%10);
            temp.next = node;
            temp = temp.next;
            if(num>9) carry = 1;
            else carry =0;
            if(l1!=null)l1 =  l1.next;
            if(l2!=null)l2 = l2.next;
        }
        if(carry == 1){
            Node node = new Node(1);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}

public class ImplementationLL {
    public static void main(String[] args) {
        SLL ob = new SLL();
        SLL list1 = new SLL();
        SLL list2 = new SLL();
//        list1.insertAtEnd(20);list1.insertAtEnd(30);list1.insertAtEnd(40);
//        list1.display();
//        list1.insertAtBeginning(10);list1.insertInBetween(3,35);
//        list1.display();
//        System.out.println("Size is: "+list1.size);
//        System.out.println(list1.get(2));
//        list1.delete(35);
//        list1.display();
        list1.insertAtEnd(1);
        list1.insertAtEnd(3);
        list1.insertAtEnd(5);
        list1.insertAtEnd(7);
        list2.insertAtEnd(9);
        list2.insertAtEnd(3);
        list2.insertAtEnd(5);
        list2.insertAtEnd(7);
        //list1.display(list1.head);
        list1.reverse();
        list1.display(list1.head);
       // list2.display(list2.head);
        list2.reverse();
        list2.display(list2.head);
        list1.head = ob.addTwoNumbers(list1.head, list2.head);
        ob.display(list1.head);
       // ob.MergeTwoSortedList(list1.head, list2.head);
    }
}


