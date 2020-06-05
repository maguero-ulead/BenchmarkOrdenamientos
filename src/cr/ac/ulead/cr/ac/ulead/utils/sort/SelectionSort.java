package cr.ac.ulead.cr.ac.ulead.utils.sort;

public class SelectionSort implements Sort{


    @Override
    public int[] sortArray(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length-1; i++){
            min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
