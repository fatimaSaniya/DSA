package Heaps;
class Minheap{
    int[] arr;
    int size;
    Minheap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int n) throws Exception{
        if(size == arr.length) throw new Exception("Heap is full!");
        arr[size++] = n;
        upHeapify(size-1);
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Heap is empty!");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void upHeapify(int idx){
        if(idx == 0) return; //base case
        int p = (idx-1)/2;
        if(arr[idx] < arr[p]) swap(idx , p);
        upHeapify(p);
    }
    public void downHeapify(int i){
        if(i >= size) return; //base case
        int lc = 2*i+1,  rc = 2*i+2;
        int minIdx = i;
        if(lc < size && arr[lc] < arr[minIdx]) minIdx = lc;
        if(rc < size && arr[rc] < arr[minIdx]) minIdx = rc;
        if(i == minIdx) return;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
    public int peak() throws Exception{
        if(size == 0){
            throw new Exception("Empty Heap!");
        }
        return arr[0];
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int getSize(){
        return size;
    }
}
public class MinHeapImplementationByArray {
    public static void main(String[] args) throws Exception {
        //Heap is implemented by using array and visualised as CBT with Heap Order Property(HOP)
        //left child = 2*p(parent) + 1
        //right child = 2*p + 2
        // p = (c-1)/2 --> c can be lc or rc
        Minheap q = new Minheap(10);
        q.add(1);
        q.add(6);
        q.add(2);
        System.out.println("Top element: " +q.peak());
        q.remove();
        q.add(0);
        q.remove();
        System.out.println("Top element: " +q.peak());
        q.add(-4);
        System.out.println("Top element: " + q.peak());
    }
}
