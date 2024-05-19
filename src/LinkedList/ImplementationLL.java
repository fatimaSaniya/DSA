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

    void display() {
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
        list1.insertAtEnd(100);
        list1.insertAtEnd(300);
        list1.insertAtEnd(500);
        list1.insertAtEnd(700);
        list2.insertAtEnd(101);
        list2.insertAtEnd(301);
        list2.insertAtEnd(501);
        list2.insertAtEnd(701);
        list1.display();
        list2.display();
        ob.MergeTwoSortedList(list1.head, list2.head);
    }
}


