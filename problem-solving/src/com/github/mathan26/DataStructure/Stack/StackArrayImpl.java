package com.github.mathan26.DataStructure.Stack;

public class StackArrayImpl {
    int[] arr;
    int pos=0;

    public StackArrayImpl(int size) {
        arr= new int[size];
    }

    public static void main(String[] args) {
        StackArrayImpl obj = new StackArrayImpl(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.pop();
        obj.pop();
        obj.pop();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.peek();
        while (!obj.isEmpty()){
            obj.pop();
        }
    }

    private void peek() {
        if(!isEmpty())
            System.out.println(arr[pos-1]);
    }

    private boolean isEmpty() {
        return pos==0;
    }

    private void pop() {
        if(pos<-1){
            System.out.println("Underflow");
        }else {
            System.out.println(arr[--pos]);
        }
    }

    private void push(int data) {
        if(pos<arr.length){
            arr[pos++]=data;
        }else {
            System.out.println("Overflow");
        }
    }
}
