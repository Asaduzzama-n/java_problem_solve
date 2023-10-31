package string_practice;

import java.util.Scanner;

public class Regular_expression_tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();
        String[] tokens = str.split("[\\s!,_;?.@/']+");
        if (str.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }

        }
    }
}
