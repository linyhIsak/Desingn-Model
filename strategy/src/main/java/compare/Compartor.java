package compare;

import strategy.CompareStrategy;

/**
 * 比较器
 * @param <T>
 */
public class Compartor<T> {

    public void sort(T[] arr, CompareStrategy<T> compareStrategy){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = compareStrategy.strategy(arr[j], arr[i]) == -1 ? j : min;
            }
            swap(arr, i, min);
        }
    }

    private void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
