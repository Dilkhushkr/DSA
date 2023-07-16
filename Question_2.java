// Write the program to traverse over the element of the Array using for each loop and print all even
// element ?
import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int S = sc.nextInt();
        int arr[] = new int[S];
        int n = arr.length;
        System.out.println("Enter the Array Element");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The fine result is : ");
        for(int a:arr)
        {
            if(a%2==0)
            {
                System.out.println(" "+a);
            }
        }

    }
}
