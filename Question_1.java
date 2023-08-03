import java.util.Arrays;

/**
 * Question_1 :- Write a program to sort an array in descending order using bubble sort 
 */
public class Question_1 {
   public static void Bubble_sort(int arr[]){
     for(int i =0;i<arr.length;i++)
     {
        boolean swapped = false;
        for(int j = 0;j<arr.length-i-1;j++)
        {
          if(arr[j]<arr[j+1])
          {
               int temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1] = temp;
               swapped = true;
          }
        
        }
        if(swapped==false)
        {
            break;
        }
     }
   }
    public static void main(String[] args) {
        int arr[]  = {3,5,1,6,0};
        Bubble_sort(arr);
        System.out.println("Sorted Array in Disending order :");
        System.out.println(Arrays.toString(arr));

    }
}