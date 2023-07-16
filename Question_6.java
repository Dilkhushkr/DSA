
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int m = sc.nextInt();
        System.out.println("Enter the colum");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int positive=0;
        int negative=0;
        int Zero=0;
        int odd=0;
        int even=0;
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {


                if(arr[i][j]<0)
                {
                    negative++;
                }
                else if(arr[i][j]>0)
                {
                    positive++;
                }
                else if(arr[i][j]==0)
                {
                    Zero++;
                }
                if(arr[i][j]%2==0)
                {
                    even++;
                }
                else {
                    odd++;
                }



            }
        }
        System.out.println("The positive number is : "+positive);
        System.out.println("The negative number is : "+negative);
        System.out.println( "The zero number is :"+Zero);
        System.out.println("The Even number is :"+even);
        System.out.println("The odd number is :"+odd);

    }
}
