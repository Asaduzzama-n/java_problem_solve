package function_practice;

import java.util.Scanner;

public class Factorial_calculation {

    public static int calc_factorial(int num){
        int fact = 1;
        for(int i=num; i>=1; i--){
            fact = fact * i;
            if(i == num)
                System.out.print(i+"! = ");
            System.out.print(i);
            if(i==1){
                System.out.print(" = ");
            }else{
                System.out.print(" x ");
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i=num1; i<=num2; i++){
            int result = calc_factorial(i);
            System.out.println(result);;
        }
    }
}
