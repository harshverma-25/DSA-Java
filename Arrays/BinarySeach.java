public class BinarySeach {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int target = 90;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        
        while (low<=high) {
             mid = low + (high - low)/2;
            if (arr[mid] == target) {
                System.out.println("Found At Index - "+ mid);
                break;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
    }
}
