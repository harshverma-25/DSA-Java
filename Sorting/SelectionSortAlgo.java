public class SelectionSortAlgo {

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minn = Integer.MAX_VALUE;
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minn) {
                    minn = arr[j];
                    index = j;

                }
            }

            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
