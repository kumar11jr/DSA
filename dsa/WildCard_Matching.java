public class WildCard_Matching{
    public static boolean wildcard(String s,String p){
        if (s == p || p == "*" || (s.length()==1 && p == "?") || p=="*?" || p=="?*") {
            return true;
        }

        if (p.contains("*")) {
            String ss = "";
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i)!= '*') {
                    ss+=p.charAt(i);
                }
            }
            // System.out.println(ss);
            for (int i = 0; i < ss.length(); i++) {
                if (s.indexOf(ss.charAt(i)) == -1) {
                    return false;
                }
                
            }
            return true;
        }

        if (p.contains("?")){
           String ss = "";
           int count = 0;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i)!= '?') {
                    ss+=p.charAt(i);
                }
            } 

            // System.out.println(ss);
            for (int i = 0; i < ss.length(); i++) {
                if (s.indexOf(ss.charAt(i)) == -1) {
                    count++;
                }
            }
            // System.out.println(count);
            if (count == 0) {
               return true; 
            }
            return false;
        }
        // System.out.println("hii");
        return false;
    }




    public static boolean isMatch(String s, String p) {
        return isMatchHelper(s, p, 0, 0);
    }

    private static boolean isMatchHelper(String s, String p, int sIndex, int pIndex) {
        if (pIndex == p.length()) {
            return sIndex == s.length();
        }

        if (p.charAt(pIndex) == '*') {
            while (pIndex < p.length() && p.charAt(pIndex) == '*') {
                pIndex++;
            }

            if (pIndex == p.length()) {
                return true;
            }

            while (sIndex < s.length()) {
                if (isMatchHelper(s, p, sIndex, pIndex)) {
                    return true;
                }
                sIndex++;
            }
        } else if (sIndex < s.length() && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
            return isMatchHelper(s, p, sIndex + 1, pIndex + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        System.out.println(wildcard(s,p));
        System.out.println(isMatch(s,p));
    }
}