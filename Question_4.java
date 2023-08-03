// Find out how many pass would be required  to sort following array using bubble sort 
// input array {3,5,1,6,0}
public class Question_4 {
    public static int   Pass_Bubble_Sort(int []arr,int n){
        int pass_count = 0;
        for(int  i =0;i<n;i++)
        {
            boolean swapped = false;
            pass_count+=1;
            for(int j = 0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                      int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1]=temp;
                      swapped  = true;
                }

            }
            if(swapped==false)
            {
                break;
            }
        }
        return pass_count;
    }
    public static void main(String[] args) {
        int []arr = {3,5,1,6,0};
        int n = arr.length;
      int res =  Pass_Bubble_Sort(arr,n );
      System.out.println("Pass Wiould be :-"+res);
        

    }
    
}
