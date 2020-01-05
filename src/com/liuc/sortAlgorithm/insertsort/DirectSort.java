package com.liuc.sortAlgorithm.insertsort;

/**
 * 插入排序
 * 1. 从第一个元素开始，该元素可以认为已经被排序
 * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 5. 将新元素插入到该位置后
 * 6. 重复步骤2~5
 *
 * 时间复杂度：O(n²)
 * 空间复杂度：O(1)
 */
public class DirectSort {
    public static void insertionSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int cur = arr[i];
                    arr[i] = arr[j];
                    arr[j] = cur;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,5,10,9,2,1,6};
        insertionSort(arr);
        for(int j=0;j<arr.length;j++){
            if (j != 0){
                System.out.print("->");
            }
            System.out.print(arr[j]);

        }
    }
}
