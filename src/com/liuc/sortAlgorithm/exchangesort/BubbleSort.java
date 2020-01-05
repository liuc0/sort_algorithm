package com.liuc.sortAlgorithm.exchangesort;

/**
 * 冒泡排序
 * ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * ③. 针对所有的元素重复以上的步骤，除了最后一个。
 * ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
 *
 * 时间复杂度:O(n²)
 * 空间复杂度:O(1)
 **/

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = arr.length-1;i>0;i--){     //设置外部游标，制定排序好的最大值
            for (int j = 0;j<i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,10,9,1,6};
        bubbleSort(arr);
        for(int j=0;j<arr.length;j++){
            if (j != 0){
                System.out.print("->");
            }
            System.out.print(arr[j]);

        }
    }
}
