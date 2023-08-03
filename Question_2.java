import java.util.Arrays;
// Write a program to sort an array in descending order using selection sort
public class Question_2 {
    public static void  SelectionSortDescending(int []arr){
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {
            
            int mix= i;
            for(int j = i+1;j<arr.length;j++){
            
                if(arr[j]>arr[mix])
                {
                    mix=j;
                }
            }
            if(mix!=i)
            {
            
                int temp = arr[mix];
                arr[mix] = arr[i];
                arr[i] = temp; 
            }
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        SelectionSortDescending(arr);
        System.out.println("Sorted Array is :");
        System.out.println(Arrays.toString(arr));
    }
    
}
