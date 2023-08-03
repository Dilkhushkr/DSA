import java.util.Scanner;
public class Question_8 {
    public static int Efficiently_Count(int [] arr,int n){
        int low =0,high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid] == 0)
            {
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (arr.length-low);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Size of Array");
         int n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter the Array Element :");
         for(int i =0;i<n;i++)
         {
            arr[i] = sc.nextInt();
         }
       int res =  Efficiently_Count(arr,n);
      System.out.println("The element 1 is found :"+res);
    }
}
