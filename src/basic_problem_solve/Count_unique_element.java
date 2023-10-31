package basic_problem_solve;

import java.util.Scanner;

//4. Write a program that prints the number of occurrences of each unique elements of an
//array.
public class Count_unique_element {
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
            for(int j=0; j<=i-1;j++){
                if(key == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                int count = 1;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] == key){
                        count++;
                    }
                }
                System.out.println(key + " occurs " + count + " times ");
            }
        }
    }
}
