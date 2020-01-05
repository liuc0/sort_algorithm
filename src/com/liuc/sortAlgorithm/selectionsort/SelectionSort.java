package com.liuc.sortAlgorithm.selectionsort;
/**
 * 选择排序
 * 平均时间复杂度:O(n²)
 * 1. 从待排序序列中，找到关键字最小的元素；
 * 2. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
 * 3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
 *    仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            int min = i;    //数组中最小的指针
            for (int j = i+1;j<arr.length;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];      //交换操作
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,10,9,2,1,6};
        selectionSort(arr);
        for(int j=0;j<arr.length;j++){
            if (j != 0){
                System.out.print("->");
            }
            System.out.print(arr[j]);

        }
    }
}
