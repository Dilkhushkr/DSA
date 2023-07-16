public class Question_5 {
    public static int Peak(int [] arr,int n) {
        if (n == 1)
            return arr[0];
        if (arr[0] >= arr[1])
            return arr[0];
        if (arr[n - 1] >= arr[n - 2])
            return arr[n - 1];
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1])
                return arr[i];
        }
        return 0;
    }
        public static void main(String[] args) {
        int arr[]   = {1,4,7,3,2};
        int n = arr.length;
        System.out.println("The peak element is :"+Peak(arr,n));

    }
}
