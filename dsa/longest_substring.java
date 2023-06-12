import java.util.ArrayList;

public class longest_substring {
    public static int count(String sub){
        int n = sub.length();
        int res = 0;
        ArrayList<Character> visited = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (visited.contains(sub.charAt(j))) {
                    visited.clear();
                    break; 
                }
                visited.add(sub.charAt(j));
                if (res<j-i+1) {
                    res = j-i+1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String sub = "ababcbc";
        int ans = count(sub);
        System.out.println(ans);
    }
}
