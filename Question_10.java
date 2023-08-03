import java.util.Scanner;
public class Question_10 {
    public static boolean Squre(int n){
        boolean ans = false;
        int low =0,high = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int val = mid*mid;
            if(val==n)
            {
                ans = true;
            } 
            else if(val>n){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number:");
        int n = sc.nextInt();
        boolean res = Squre(n);
        System.out.println(res);

    }
}
