package cr.ac.ulead.cr.ac.ulead.utils.sort;

public class InsertionSort implements Sort {

    @Override
    public int[] sortArray(int[] array) {
        int v = 0; int j =0;
        for (int i = 0; i < array.length; i++){
            v = array[i];
            j = i-1;
            while (j >=0 && array[j] > v){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = v;
        }
        return array;
    }

}
