package Sort;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2, 0, 5, 4, 8, 9, 3, 1, 6, 7};
        sort(array, 0, array.length - 1);

        System.out.printf("{");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]  + ", ");
        }
        System.out.println("}");
    }

    public static void sort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do{
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while  (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while(leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            sort(array, leftPosition, endPosition);
        }
        
        if(startPosition < rightPosition) {
            sort(array, startPosition, rightPosition);
        }
    }
}