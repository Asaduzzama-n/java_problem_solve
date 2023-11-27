package greedy_algorithm.coin_change_problem;

import java.util.Arrays;
import java.util.Collections;

public class Coin_change_brute_force_approach {
    public static void calculate_coin(Integer coins[], int total_no_of_coins, int remaining_amount){
        for(int i=0; i<coins.length; i++){
            int current_coin = coins[i];
            int no_of_coin_needed = (int)Math.floor(remaining_amount / current_coin);
            remaining_amount = remaining_amount % current_coin;

            System.out.println(current_coin+ " needed: " + no_of_coin_needed);

            total_no_of_coins = total_no_of_coins + no_of_coin_needed;
        }
        System.out.println("Minimum coin needed: " + total_no_of_coins);
    }

    public static void main(String[] args) {
        Integer[] coins = {10,2,50,20,5};
        Arrays.sort(coins, Collections.reverseOrder());
        int total_no_of_coins = 0;
        int  remaining_amount = 157;
        calculate_coin(coins, total_no_of_coins, remaining_amount);
    }
}

