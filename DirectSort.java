package Java.Sort;

/**
 * DirectSort
 */
public class DirectSort {

    public static void main(String[] args) {
        int[] arr = new int[] {
            4, 3, 6, 2, 10, 8, 7, 9, 5, 1
    };
    directSort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(" " + arr[i]);
    }
    }
    
    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }
}