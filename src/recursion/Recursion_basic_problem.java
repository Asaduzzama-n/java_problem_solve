package recursion;


public class Recursion_basic_problem {
    public static void recursive_function(int i, int n) {
        if(i>n){
            return;
        }else{
            System.out.println(i);
            recursive_function(++i,n);
            System.out.println(i);
        }

    }

    public static int sum_to_n(int i,int n){
        if(i>n){
            return 0;
        }else{
            return i+sum_to_n(i+1,n);
        }
    }
    public static int sum_to_n_reverse(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum_to_n_reverse(n-1);
        }
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

    }

    public static int sum_of_digits(int n){
        if(n<10){
            return n;
        }
        int lastDigit = n%10;
        int remainingDigits = n/10;
        return lastDigit+ sum_of_digits(remainingDigits);

    }

    public static int count_digits(int n){
        if(n==0){
            return 0;
        }

        int remainingDigits = n/10;
        return 1+ count_digits(remainingDigits);

    }


    public static int value_of_nth_fibonacci(int n){
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return value_of_nth_fibonacci(n-1)+value_of_nth_fibonacci(n-2);
        }
    }

    public static int power_calc(int a,int b){
        if(b == 0){
            return 1;
        }else{
            return a*power_calc(a,b-1);
        }
    }
    public static void sum_to_n_new(int i, int n, int sum){
        if(i>5){
            return;
        }
        sum+=i;
        sum_to_n_new(i+1,n,sum);
        System.out.println(sum);
        
    }

    public static void main(String[] args) {

//        recursive_function(1,4);
//        System.out.println(sum_to_n(1,4));
//        System.out.println(sum_to_n_reverse(5));
//        System.out.println(factorial(5));
//        System.out.println(sum_of_digits(111));
//        System.out.println(count_digits(23456));
//        System.out.println(value_of_nth_fibonacci(9));
//        System.out.println(power_calc(2,8));
        sum_to_n_new(1,5,0);
    }


}
