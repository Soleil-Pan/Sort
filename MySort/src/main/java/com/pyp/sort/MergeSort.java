package com.pyp.sort;

import com.sun.scenario.effect.Merge;

//归并排序 时间复杂度：O(n*log2(N))
public class MergeSort {
    public static void main(String[] args) {
        //int[] arr = {1,11,6,5,10,9,8,12,3,4,14,7,2,13};
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0,arr.length-1);
        print(arr);
    }


    public static void sort(int[] arr,int left,int right){
        if(left == right) return;
        //分成两半
        int mid = left + (right - left)/2;
        //左边排序
        sort(arr,left,mid);
        //右边排序
        sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);

    }

    static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound){
        int mid = rightPtr - 1;
        int[] temp  = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j <= rightBound){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
//            if(arr[i] <= arr[j]){   //稳定
//                temp[k++] = arr[i++];
//            }else {
//                temp[k++] = arr[j++];
//            }
        }

        //左边数组有剩余，复制
        while (i <= mid) temp[k++] = arr[i++];
        //右边数组有剩余，复制
        while (j <= rightBound) temp[k++] = arr[j++];

        //将temp数组复制到arr上
        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr + m] = temp[m];
        }


        //print(temp);
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
