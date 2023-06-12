import java.util.Stack;
public class basic_cal_II {
    public static int cal(String s){
        if (s.length() ==0 || s == null) {
            return 0;
        }

        Stack<Integer> st = new Stack<>();
        int curr = 0;
        char op = '+';
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                curr = curr*10 + ch[i] - '0';
            }
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i ==ch.length-1) {
                if (op == '+') {
                    st.push(curr);
                }
                if (op == '-') {
                    st.push(curr);
                }
                if (op == '/') {
                    st.push(st.pop()/curr);
                }
                if (op == '*') {
                    st.push(st.pop()*curr);
                }
                op = ch[i];
                curr = 0;
            }

        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum+=st.pop();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        String s = "0-3+2*2";
        System.out.println(cal(s));
        

    }
}
 