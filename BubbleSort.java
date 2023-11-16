package Sort;

/**
 * bubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {
                4, 3, 6, 2, 10, 8, 7, 9, 5, 1
        };
        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void bubblesort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }
}