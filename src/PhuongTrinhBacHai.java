public class PhuongTrinhBacHai{
    private static String Calc(double a,double b,double c){
        if (a == 0) {
            if (b == 0 && c != 0)
                return "vo nghiem";
            else if (b == 0 && c == 0)
                return "vo so nghiem";
            else
                return "x = " + (-c / b);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                return "vo nghiem";
            else if (delta == 0)
                return "x = " + (-b / (2 * a));
            else {
                double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                if (x2 < x1) {
                    return "x1 = " + x2 + "\nx2 = " + x1;
                } else {
                    return "x1 = " + x1 + "\nx2 = " + x2;
                }
            }
        }
    }
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        System.out.println(Calc(a, b, c));
    }
}