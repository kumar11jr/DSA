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
        }

        if (p.contains("?")){
            
        }
        // System.out.println("hii");
        return true;
    }
    public static void main(String[] args) {
        String s = "gqff";
        String p = "*g";
        System.out.println(wildcard(s,p));
    }
}