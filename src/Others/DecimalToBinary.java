package Others;

public class DecimalToBinary {
    public static void main(String[] args) {
            int n = 33;
            StringBuilder sb = new StringBuilder();

            while(n > 0){
                sb.append(n % 2);
                n /= 2;
            }

        System.out.println(sb);
        }
    }