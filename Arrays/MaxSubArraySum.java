public class MaxSubArraySum {
    public static int SubArray(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum += arr[j2];
                }
                if (sum > MaxSum) {
                    MaxSum = sum;
                }

            }
        }
        return MaxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
         int result = SubArray(arr);
        System.out.println("Maximum Subarray Sum = " + result);

  
        
    }
}
