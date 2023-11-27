package divide_and_conquer;

public class Min_max_recursion {

    static class MinMax{
        int min;
        int max;
    }


    public static MinMax findMinMax (int arr[], int left, int right){
        if(left == arr.length-1){
            MinMax result = new MinMax();
            result.max = arr[left];
            result.min = arr[left];

            return result;
        }else{
            int currentElement = arr[left];
            MinMax friend = findMinMax(arr, left+1, right);

            MinMax finalResult = new MinMax();

            if(currentElement < friend.min){
                finalResult.min = currentElement;
            }else{
                finalResult.min = friend.min;
            }

            if(currentElement> friend.max){
                finalResult.max = currentElement;
            }else{
                finalResult.max = friend.max;;
            }
            return finalResult;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 8, 5, 2, 3, 6, -9, 0};
        MinMax result = findMinMax(arr, 0, arr.length-1);
        System.out.println("Maximum: "+ result.max + " Minimum: "+ result.min);

    }
}
