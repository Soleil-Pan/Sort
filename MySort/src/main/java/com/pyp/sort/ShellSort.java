package com.pyp.sort;

//希尔排序 时间复杂度：O(n1.3)
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1,11,6,5,10,9,8,12,3,4,14,7,2,13};
        sort(arr);
        print(arr);
    }


    public static void sort(int[] arr){
        //计算间隔序列,knuth序列
        int h = 1;
        while (h <= arr.length / 3){
            h = h*3 + 1;
        }

        for (int gap = h; gap > 0 ; gap = (gap-1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap-1; j-=gap) {
                    if(arr[j] < arr[j-gap])
                        swap(arr,j,j-gap);
                }
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
