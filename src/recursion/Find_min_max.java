package recursion;

public class Find_min_max {

    static class MinMax{
        int minimum;
        int maximum;
    }

    static public MinMax findMinMax(int arr[], int left, int right){
        if(left == right){
            MinMax result = new MinMax();
            result.minimum = arr[left];
            result.maximum = arr[right];

            return result;
        } else if (left+1 == right ) {
            MinMax result = new MinMax();

            if(arr[left]> arr[right]){
                result.maximum = arr[left];
                result.minimum = arr[right];
            }else{
                result.maximum = arr[right];
                result.minimum = arr[left];
            }

            return result;
        }else{
            int mid = (int) (left + right) / 2;
            MinMax leftSide = findMinMax(arr,left, mid);
            MinMax rightSide = findMinMax(arr,mid+1, right);

            MinMax finalResult = new MinMax();

            if(leftSide.minimum < rightSide.minimum){
                finalResult.minimum = leftSide.minimum;
            }else{
                finalResult.minimum = rightSide.minimum;
            }

            if(leftSide.maximum > rightSide.maximum){
                finalResult.maximum = leftSide.maximum;
            }else{
                finalResult.maximum = rightSide.maximum;
            }

            return finalResult;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 8, 5, 2, 3, 6, -9, 0};
        MinMax result = findMinMax(arr, 0, arr.length-1);
        System.out.println("Maximum: "+ result.maximum + " Minimum: "+ result.minimum);

    }
}
