public class plusOne {
    public static int[] plus(int[] fresh){
       for (int i = fresh.length-1; i >=0; i--) {
        if (fresh[i]<9) {
            ++fresh[i];
            return fresh;
        }
        fresh[i] = 0;
       }
       int[] ans = new int[fresh.length+1];
       ans[0] = 1;
       return ans;
    }
    public static void main(String[] args) {
        int[] old = {8,9};
        int[] ans = plus(old);
        
    }
}
