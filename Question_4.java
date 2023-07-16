// Q.4 write a program to find out the second largest element in a given array.
import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        int arr[] ={34,21,54,65,43};
        int first=Math.max(arr[0],arr[1]);
        int sec = Math.min(arr[0],arr[1]);
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>sec)
            {
                sec=arr[i];
            }
        }
        System.out.println("The first largest value is:"+first);
        System.out.println("The second largest value is :"+sec);

    }
}
