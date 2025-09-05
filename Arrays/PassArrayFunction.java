public class PassArrayFunction {

    public static void UpdateArray(int arr[], int value){
        value = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        int value = 55;
        int arr[] = {10,25,35,84,90};
        UpdateArray(arr, value);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.print("\n"+value);


    }
}
