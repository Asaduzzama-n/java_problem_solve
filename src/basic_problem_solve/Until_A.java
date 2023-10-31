package basic_problem_solve;

import java.util.Scanner;

//2. Write a program that will run and show keyboard inputs until the user types an ’A’ at
//        the keyboard.
public class Until_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String chr = sc.next();
            if(chr.contains("A")){
                break;
            }else{
                System.out.println(chr);
            }
        }
    }
}
