package Others;

public class BinaryToDecimal {
    public static int binaryToDecimal(String b){
        int n = b.length();
        int result = 0;
        int power = 0;
        for (int i = 0; i < n; i++) {
            if(b.charAt(i)=='1'){
                result = (int) (result + Math.pow(2,power));
            }
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        String b = "100001";
        System.out.println(binaryToDecimal(b));

    }
}

//int j = 1;
//int n = b.length();
//int result = 0;
//        for(int i=n-1; i>=0; i--){
//        if(b.charAt(i)=='1'){
//result = result + j;
//            }
//j = j*2;
//        }
//        return result;
