package com.Ritesh.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T removed = (T) (data[size--]);
        return removed;
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(8);
//        list.add(9);
//        System.out.println(list);
        CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list2.add(i * 2);
        }
        System.out.println(list2);
    }
}
