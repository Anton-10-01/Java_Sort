package Sort;

/**
 * HeapSort
 */
public class HeapSort {

    public static void main(String[] args) {
        
    }

    public static void sort(int[] array) {
        //Построение кучи(перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        //Один за другим извлекаем жлементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            //Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int left = 2 * rootIndex + 1; // левый
        int right = 2 * rootIndex + 2; // правый

        // Если левый элемент больше корня
        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }

        // Если правый элемент больше, чем самый большой элемент на данный момент
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        //Если самый большой элемент не корень
        if(largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
        }

        //Рекурсивно преобразуем в двоичную кучу затронутое дерево
        heapify(array, heapSize, largest);
    }
}