public class Fibonacii{
    private static int FindFibonacii_Number(int[] fibo,int n){
        for(int i = 0;i < n;i++){
            if(i == 0 || i == 1){
                fibo[i] = 1;
            }
            else{
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        return fibo[n - 1];
    }

    private static int FindFibonacii_Number_Nearly(int[] fibo,int n){
        for(int i = 0;i < 50;i++){
            if(i == 0 || i == 1){
                fibo[i] = 1;
            }
            else{
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            if(fibo[i] > n){
                return Math.abs(fibo[i - 1]-n) > Math.abs(fibo[i] - n) ? fibo[i] : fibo[i - 1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 11;
        int[] fibo = new int[n];
        System.out.println(FindFibonacii_Number(fibo, n));
        System.out.println(FindFibonacii_Number_Nearly(fibo, n));
    }
}
