import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        boolean falg = false;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to add:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Array elemnt :");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elemnt you want to serach:");
        int key = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            if(arr[i]==key)
            {
                 falg = true;
                 index = i;
                 break;
            }
            
        }
        if(falg == true)
        {
            System.out.println(index);
        }
        else
        {
            System.out.println("Element is not found..");
        }

    }
}
