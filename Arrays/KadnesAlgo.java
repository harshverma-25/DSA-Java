public class KadnesAlgo {
    public static int KadnesAlgo(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum>maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2, -4, 6, -1, 2, -5, 3};
        int result = KadnesAlgo(arr);
        System.out.println("Max Sum is " + result);
    }   
}
