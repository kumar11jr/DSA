import java.util.ArrayList;

public class parenthesis_no {
    public static boolean valid(int x){
        String st = String.valueOf(x);
        System.out.println(st);
        String nw = "";
        for (int i = st.length()-1; i >= 0; i--) {
            nw += st.charAt(i);
        }
        System.out.println(nw);
        if (st.equals(nw)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x = -121;
        System.out.println(valid(x));
    }
}
