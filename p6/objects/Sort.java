package objects;

public class Sort<T> {
    private T[] arr;
    private Comparator<T> ICmp;
    public Sort(T[] arr, Comparator<T> ICmp){
        this.arr = arr;
        this.ICmp = ICmp;
        sort(0, arr.length - 1);
    }

    public T[] getArr() {
        return arr;
    }

    private void sort(int l, int r){
        int i = l, j = r;
        T m = arr[(l + r) / 2];
        while (i <= j){
            while (ICmp.cmp(arr[i], m)) i += 1;
            while (ICmp.cmp(m, arr[j])) j -= 1;
            if (i >= j) break;
            T tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            i += 1; j -= 1;
        }
        if (l < j) sort(l, j); 
        if (j + 1 < r) sort(j + 1, r);
    }
}
