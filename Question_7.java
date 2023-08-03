/**
 * Question_7
 */
public class Question_7 {
       public static int Lastoccure(int [] arr,int target){
        int low =0,high = arr.length-1;
        int result = -1;
          while (low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                result = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
           
          }
        return result;
       }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5,6,6,6,6};
        int target = 4;
       int res =  Lastoccure(arr,target);
        if(res == -1){
            System.out.println("Element is not found:");
        }
        else{
            System.out.println("Elemnt is found index :- "+res);
        }
       }
    }