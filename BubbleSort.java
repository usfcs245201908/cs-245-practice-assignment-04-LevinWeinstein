public class BubbleSort implements SortingAlgorithm {
    private void swap(int  []a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public void sort(int []a){
        for (int i = 0; i < a.length - 1; i++){
            for (int j  = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1])
                    swap(a, j , j + 1);
            }
        }
    }
}
