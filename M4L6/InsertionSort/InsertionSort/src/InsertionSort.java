public class InsertionSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;
            while(j >= 0 && array[j] > current){
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = current;
        }
    }
}
