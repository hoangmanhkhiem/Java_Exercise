public class StringgDelete{
    private static String Delete(String str,int n){
        String tmp = "";
        for(int i = 0;i < n;i++){
            if(str.charAt(i) != 'a'){
                tmp += str.charAt(i);
            }
        }
        String result = "";
        String[] arr = tmp.split(" ");

        return result;
    }
    public static void main(String[] args) {
        String str = "Lap trinh java khong don gian";
        int n = str.length();
        System.out.println(Delete(str, n));

    }
}
