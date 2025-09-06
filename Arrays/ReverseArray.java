public class ReverseArray {
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }

    public static void ReverseArr(int arr[]){
        int n = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i,n);
            n--;
        }
    }
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7,8};
         ReverseArr(arr);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
    }
   

}
