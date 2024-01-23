public class CalcTheSubMath{
    private static int[] init(int[] gt,int n){
        gt[0] = 1;
        for(int i = 1;i < n;i++){
            gt[i] = gt[i - 1]*i;
        }
        return gt;
    }

    private static int[] init_2(int[] gt2,int n){
        gt2[0] = 1;
        for(int i = 1;i < n;i++){
            gt2[i] = gt2[i - 1]*(n - i + 1);
        }
        return gt2;
    }
    private static double Calc(int[] gt,int[] gt2,int n, int x){
        double S = 1;
        for(int i = 1;i <= n;i++){
            S += (Math.pow(x, i)/gt[i])*gt2[i];
            n--;
        }
        return S;
    }
    public static void main(String[] args) {
        int n = 3;
        int x = 1;
        int[] giaithua = new int[n];
        giaithua = init(giaithua, n);
        int[] giaithua2 = new int[n];
        giaithua2 = init_2(giaithua2, n);
        System.out.println(Calc(giaithua,giaithua2,n,x));
    }
}

// 3*1/1! + 3*2*1/2! + 3!*1/3! = 3 + 3 + 1 = 7
