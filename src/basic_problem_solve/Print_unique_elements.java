package basic_problem_solve;

//Write a program that prints all the unique elements of an array once.

import java.util.Scanner;

public class Print_unique_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            boolean flag = false;
            for(int j=0; j<=i-1; j++){
                if(key == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(arr[i]);
            }
        }


//        for(int i=0; i<arr.length; i++){
//            int key = arr[i];
//            boolean flag = false;
//            for(int j=i+1; j<arr.length; j++){
//                if(key == arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag){
//                System.out.println(key);
//            }
//        }

    }
}
