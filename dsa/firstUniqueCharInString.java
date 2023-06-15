public class firstUniqueCharInString {
    public static int uniqueFirst(String s){
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(uniqueFirst(s));
    }
}
