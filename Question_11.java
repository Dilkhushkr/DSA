import java.util.Scanner;

/**
 * Question_11
 */
public class Question_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if((num&1)==1){
            System.out.println("This is odd number :"+num);
        }
        else{
            System.out.println("This is even number :"+num);
        }
    }
}