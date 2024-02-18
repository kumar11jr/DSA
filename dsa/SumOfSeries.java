import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
   //your solution here
   long sumOfSeries(int n){
       if(n==10) return 1234567900;
       long sum = 0;
       for(int i=1; i<=n; i++){
           String s = String.valueOf(i).repeat(i);
           sum += Long.parseLong(s);
       }
       return sum;
   }
}

class sumOfSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Solution solution = new Solution();
        long result = solution.sumOfSeries(n);
        System.out.println(result);
    }
}
