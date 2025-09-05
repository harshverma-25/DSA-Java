public class LargestArray {
    public static void main(String[] args) {
        int arr[] = {5,9,6,8,3,4,25,6,3};
        
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
            }
        }
        System.out.println("Largest Value is " + maxx);
    }
}
