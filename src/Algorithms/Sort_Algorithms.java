package Algorithms;

public class Sort_Algorithms {

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            swap(array, min, i);
        }
        return array;
    }

    public static int[] insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j > 0 && tmp < array[j-1]){
                array[j] = array[j-1];
                j = j - 1;
            }
            array[j] = tmp;
        }
        return array;
    }

    public static int[] shellSort(int[] array){

        for (int gap = array.length/2; gap > 0 ; gap/=2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j>= gap && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }

    public static void mergeSort(int[] array, int start, int end){

        if (end - start < 2){
            return;
        }
        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end){

        if (array[mid-1] <= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    public static void quickSort(int[] array, int start, int end){

        if (end - start < 2){
            return;
        }
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex+1, end);
    }

    public static int partition(int[] array, int stsrt, int end){

        int pivot = array[stsrt];
        int i = stsrt;
        int j = end;

        while (i < j){
            while (i < j && array[--j] >= pivot);
            if (i < j){
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivot);
            if (i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
    
    public static void countingSort(int[] array, int min, int max){

        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        int j = 0;
        for (int i = min; i <=max; i++){
            while (countArray[i - min] > 0){
                array[j++] = i;
                countArray[i - min]--;
            }
        }

    }

    public static void swap(int[] array, int i, int j){

        if (array[i] == array[j]){
            return;
        }
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    public static void showArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
