//Write a program to print the sum of all elements present on even indices in the given array?
import java.util.Scanner;
public class Question_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int n = arr.length;
        int sum = 0;
        System.out.println("Enter the Array elements");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            if(i%2==0)
            {
                sum = sum+arr[i];
            }
        }

        System.out.println("Sum so Array element is :"+sum);

    }
}
