// 3Write the program to calculate the maximum element in the array
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int s = sc.nextInt();
        int [] arr = new int[s];
        int n = arr.length;
        System.out.println("Enter the Array Element :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("This Maximum element is :"+max);

    }
}
