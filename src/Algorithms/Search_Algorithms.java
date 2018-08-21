package Algorithms;

public class Search_Algorithms {

    public static int linearSearch(int[] array, int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int iterativeBinarySearch(int[] array, int value){
        int start = 0;
        int end = array.length;

        while (start < end){
            int midpoint = (start + end)/2;
            if (array[midpoint] == value){
                return midpoint;
            }
            else if (array[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int value){
        return recursiveBinarySearch(array, 0, array.length, value);
    }

    public static int recursiveBinarySearch(int[] array, int start, int end, int value){

        if (start >= end){
            return  -1;
        }
        int midpoint = (start + end)/2;

        if (array[midpoint] == value){
            return midpoint;
        }
        else if (array[midpoint] < value){
           return recursiveBinarySearch(array,midpoint + 1, end, value);
        }
        else {
           return recursiveBinarySearch(array, start, midpoint, value);
        }
    }
}
