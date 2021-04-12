package com.pyp.sort;

//选择排序 时间复杂度：O(n*n)
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,6,5,9,8,3,4,7,2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            System.out.println("minPos: " + minPos);
            swap(arr,i,minPos);
            System.out.println("经过第" + (i+1) + "次交换后，数组的内容：");
            print(arr);
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

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }
}

