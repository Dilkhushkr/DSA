import java.util.Scanner;
public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int m = sc.nextInt();
        System.out.println("Enter the colum");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int max =arr[0][0];
        System.out.println("Enter the Array element :");
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
                if(i+j<m-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }


    }
}
