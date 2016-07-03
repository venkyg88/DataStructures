import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        reverseArr(arr, 0, n-1);       
        printArr(arr, n-1);
    }
    
    public static void reverseArr(int arr[], int start, int end){
        if( end <= start){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr, start+1, end-1);
    }
    
    public static void printArr(int arr[], int end){
        
        for(int i = 0; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
