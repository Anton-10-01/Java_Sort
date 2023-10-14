package Java.Sort;

/**
 * DirectSort
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[] {
            4, 3, 6, 2, 10, 8, 7, 9, 5, 1
    };
    insertSort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" " + arr[i]);
    }
    }
    
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}