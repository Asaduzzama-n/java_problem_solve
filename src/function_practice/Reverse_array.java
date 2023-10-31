package function_practice;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static int[] reverse_array(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start ++;
//            end --;
//        }
//        return arr;
        //using for loop
        int index = 0;
        for(int i = arr.length-1; i>=index; i--){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
        return arr;
    }

    public static void print_array(int[] arr){
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total elements: ");
        int n = sc.nextInt();
        int[] initial_arr = new int[n];
        for(int i=0; i<n; i++){
            initial_arr[i] = sc.nextInt();
        }

        print_array(reverse_array(initial_arr));
    }

}
