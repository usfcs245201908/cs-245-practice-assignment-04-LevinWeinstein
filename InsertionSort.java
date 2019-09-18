public class InsertionSort implements SortingAlgorithm {
    public void sort(int [] a){
        for (int i = 1; i < a.length; i++){
            int j, nextValue = a[i];
            for (j = i - 1; j >= 0 && a[j] > nextValue;)
                a[j + 1] = a[j--];
            a[j + 1] = nextValue;
        }
    }
}
