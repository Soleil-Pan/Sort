package com.pyp.sort;

//快速排序 时间复杂度：O(n*log2(N))
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,3,2,8,1,9,5,4,6,10};
        //int[] arr = {2,5};
        sort(arr,0,arr.length-1);
        print(arr);
    }

    public static void sort(int[] arr,int leftBound,int rightBound){
        if(leftBound >= rightBound) return;     //数组只有一个元素
        int mid = partition(arr,leftBound,rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    public static int partition(int[] arr,int leftBound,int rightBound){
        int pivot = arr[rightBound];    //定义最右边的值为轴
        int left = leftBound;   //数组左右两个指针
        int right = rightBound-1;

        while (left <= right){
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;

            if (left < right) swap(arr,left,right);
        }
        swap(arr,left,rightBound);
        return left;
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
