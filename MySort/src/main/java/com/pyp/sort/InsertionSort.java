package com.pyp.sort;

//插入排序 时间复杂度：O(n*n)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,6,5,9,8,3,4,7,2};
        sort(arr);
        print(arr);
    }


    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j] < a[j-1])
                    swap(a,j,j-1);
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
