// Write to sort an array in descending order using insertion sort

import java.util.Arrays;

public class Question_3 {
    public static void insertion_Sort(int []arr){
        for(int i = 1;i<arr.length;i++)
        {
             int j = i ;
             while(j>0&&arr[j]>arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
             }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        insertion_Sort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));

    }
    
}
