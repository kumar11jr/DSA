public class masking_info {
    public static String masking(String s){
        s = s.toLowerCase();
        String nr = "";
        if (s.contains("@")) {
            for (int i = 0; i < s.indexOf("@")-1; i++) {
                if (i == 0) {
                    nr += s.charAt(i);
                }
                nr += "*****";
                break;
            }
    
            for (int i = s.indexOf("@")-1; i < s.length(); i++) {
                nr += s.charAt(i);
            }
            return nr;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='+' || s.charAt(i)=='-'  || s.charAt(i)==' ') {
                continue;
            }
            nr += s.charAt(i);
        }
        int length = nr.length();
        String last = "";   
        int i = 4;
        while(i>0){
            last += nr.charAt(nr.length()-i);
            i--;
        }
        
        if (length == 10) {
            nr = "***-***-";
            nr += last;
            return nr;
        }
        else if(length == 11){
            nr = "+*-***-***-";
            nr += last;
            return nr;
        }
        else if(length == 12){
            nr = "+**-***-***-";
            nr += last;
            return nr;
        }
        nr = "+***-***-***-";
        nr += last;
        return nr;
    }
    public static void main(String[] args) {
        String s = "1(234)567-890";
        // s = s.toLowerCase();
        // System.out.println(s);
        System.out.println(masking(s));
    }
}
