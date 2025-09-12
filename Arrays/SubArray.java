public class SubArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+ " ");
                }
                System.out.println();
            }
            
       }
    }
}
