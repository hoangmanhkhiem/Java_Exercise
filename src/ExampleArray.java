import java.util.Arrays;
import java.util.Comparator;


import static java.sql.Types.NULL;

public class ExampleArray{
    private static int Count_positive_numbers_not_divisible3(int[] arr,int n){
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] > 0 && arr[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }

    private static int[] Caculate_Sum_and_average(int[] arr,int n){
        int[] result = new int[2];
        int sum = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] >= -5 && arr[i] <= 25){
                sum += arr[i];
                count++;
            }
        }
        if(count == 0){
            result[0] = NULL;
            result[1] = NULL;
        }
        else{
            result[0] = sum;
            result[1] = sum/count;
        }
        return result;
    }

    private static int Find_Max_Number_divisible3(int[] arr,int n){
        int max = arr[0];
        for(int i = 1;i < n;i++){
            if(arr[i] % 3 == 0 && arr[i] > max){
                max = arr[i];
            }
        }
        if(max == arr[0] && max % 3 != 0)
            return NULL;
        else
            return max;
    }

    private static int[] Arrange_numbers_to_have_increasing_absolute_value(int[] arr,int n){
        int[] result = new int[n];
        result = arr;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(result[j]) > Math.abs(result[j + 1])) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    private static int[] Delete_number_Divisible5_and_not_divisible3(int[] arr,int n){
        int[] result = new int[n];
        int[] temp = new int[n];
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] % 5 == 0 && arr[i] % 3 != 0){
                temp[count] = arr[i];
                count++;
            }
        }
        int index = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < count;j++){
                if(arr[i] == temp[j]){
                    break;
                }
                result[index] = arr[i];
                index++;
            }
        }
        result = Arrays.copyOfRange(result, 0, n - count);
        return result;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 15, 6};
        int n = 7;
        System.out.println(Count_positive_numbers_not_divisible3(arr, n));
        int[] result = Caculate_Sum_and_average(arr, n);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(Find_Max_Number_divisible3(arr, n));
        int[] result2 = Arrange_numbers_to_have_increasing_absolute_value(arr, n);
        System.out.println(Arrays.toString(result2));
        int[] result3 = Delete_number_Divisible5_and_not_divisible3(arr, n);
        System.out.println(Arrays.toString(result3));
    }
}
