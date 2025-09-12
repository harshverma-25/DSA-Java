public class MaxSubArray_PrefixSum {
    public static int SubArray(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        //Prefix Array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (currSum > MaxSum) {
                    MaxSum = currSum;
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
