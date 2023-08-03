public class Question_9 {
    public static int FirstOccurrences(int [] arr,int target,int n){
        int low =0,high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                     ans = mid;
                     high=mid-1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }
    public static int LastOccurrences(int [] arr,int target ,int n){
        int low = 0,high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == target){
                ans = mid ;
                low = mid+1;
            }
            else if(arr[mid]>target) {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={2,5,5,5,6,6,8,9,9,9};
        int target = 5;
        int n = arr.length;
       int first= FirstOccurrences(arr,target,n);
       int last = LastOccurrences(arr,target , n);
       if(last==first&&last==-1){
            System.out.println("Target is not exist");
       }
       else {
        System.out.println("The Occurrence of Tagret :"+(last-first+1)+" Times");
       }
    }
}
