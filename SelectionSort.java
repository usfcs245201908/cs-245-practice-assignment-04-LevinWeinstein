public class SelectionSort implements SortingAlgorithm {
    private void swap(int  []a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void sort(int []a){
        for (int i = 0; i < a.length - 1; i++){
            int min = i;
            for (int j = i + 1;  j < a.length; j++)
                min = a[j] < a[min] ? j : min;
            if (min != i) swap(a, min, i);
        }
    }
}
