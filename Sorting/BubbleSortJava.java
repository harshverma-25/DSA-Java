
public class BubbleSortJava {

    public static void swap(int a , int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void BubbleSortAlgo(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > arr[j+1]) {
                swap(j, j+1, arr);
                swapped = true;
            }
             }
             if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        BubbleSortAlgo(arr);

       for (int i : arr) {
        System.out.print(i+" " );
       }

    }
}
