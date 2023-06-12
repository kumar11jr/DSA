import java.util.Arrays;

public class multiply_string {
    public static String multiply(String s1, String s2){
        if (s1 == "0" || s2 == "0") {
            return "0";
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray(); 
        int n1 = ch1.length ,n2= ch2.length ;
        char[] res = new char[n1+n2];
        Arrays.fill(res , '0');
        for (int j = n2-1; j >= 0; j--) {
            for (int i = n1-1; i >= 0; i--) {
                int product = (ch1[i] - '0') * (ch2[j]-'0');
                int temp = res[i+j+1]-'0' + product;
                res[i+j+1] = (char)(temp%10 + '0');
                res[i+j] = (char) (res[i+j]-'0' + temp/10 + '0');
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean seen = false; 
        for (char c : res) {
            if (c=='0' && !seen) {
                continue;
            }
            sb.append(c);
            seen = true;

        }
        return sb.length() == 0 ? "0":sb.toString();         
    }
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1,num2));
    }
}
