package objects;

public class Sort {
    private int arr[];
    private void sort(int l, int r){
        if (l >= r) return;
        int i = l;
        int j = r;
        int m = arr[(l + r) / 2];
        while (i < j){
            while (arr[i] <= m) i += 1;
            while (arr[j] >= m) j -= 1;
            if (i >= j) break;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i += 1; j -= 1;
        }
        sort(l, j); sort(j + 1, r);
    }
    public Sort(int a[]){
        this.arr = a;
        sort(0, arr.length - 1);
    }
    public int[] getArray(){
        return arr;
    }
}
