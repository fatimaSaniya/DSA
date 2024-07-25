package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double per;
    String name;
    Student(int rno, String name, double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].rno + " ");
            System.out.print(arr[i].name + " ");
            System.out.println(arr[i].per + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(54, "Saniya" , 97.9);
        s[1] = new Student(60, "Shivi" , 96.8);
        s[2] = new Student(62, "Sneha" , 95.7);
        s[3] = new Student(49, "Sakshi" , 94.6);
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
