package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] A, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args){
        int[] array = {4,5,1,2,3,0};
        int[] A = bubbleSort(array, array.length);
        System.out.println(Arrays.toString(A));
    }
}
