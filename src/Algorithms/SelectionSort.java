package Algorithms;
import java.util.Arrays;
public class SelectionSort {
   public int[] selectionSort(int[] A, int n){
       for(int i = 0; i < n-1; i++){
           int min = i;
           for(int j = i+1; j < n; j++){
               if(A[j] < A[min]){
                   min = j;
               }
           }
           int temp = A[i];
           A[i] = A[min];
           A[min] = temp;
       }
       return A;
    }

    public static void main(String[] args){
        int[] A = {2,4,5,1,3};
        SelectionSort ss = new SelectionSort();
        A = ss.selectionSort(A, A.length);
        System.out.println(Arrays.toString(A));
    }
}
