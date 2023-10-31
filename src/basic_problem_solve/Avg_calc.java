package basic_problem_solve;

import java.util.Scanner;

//Write a program that will take N numbers as inputs and compute their average.
//        (Restriction: Without using any array)



public class Avg_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many input you will take?: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + sc.nextInt();
        }
        double avg = (double) sum/n;
        System.out.println("Avg is : " + avg );
    }
}
