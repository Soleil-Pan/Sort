package com.pyp.sort;

//冒泡排序 时间复杂度：O(n*n)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,6,5,9,8,3,4,7,2};
        sort(arr);
        print(arr);
    }

    public static void sort(int[] a){
        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) swap(a,j,j+1);
            }
        }
    }


    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


