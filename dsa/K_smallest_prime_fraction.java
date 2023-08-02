public class K_smallest_prime_fraction {
    public static int[] ans(int[] arr,double target){
        int n = arr.length;
        int count = 0;
        int num = arr[0];
        int deno = arr[n-1];
        int i = 0;
        for (int j = 1; j < n; j++) {
            while (arr[i]<=arr[j]*target) {
                i++;
            }
            count+=i;
            while (i>0 && arr[i-1]*deno >arr[j]*num) {
                num = arr[i-1];
                deno = arr[j];
            }
        }
        return new int[] {count,num,deno};
    }
    public static int[] kthSmallestPrimeFraction(int[] arr,int k){
        int n = arr.length;
        double lo = arr[0] / (double) arr[n-1];
        double hi = 1;

        while (lo<hi) {
            double mid = (lo+hi)/2;
            int[] count = ans(arr,mid);

            if (k<count[0]) {
                hi = mid;
            }
            else if (k>count[0]) {
                lo = mid;
            }
            
            else {
                return new int[] { count[1], count[2] };
            }
        }

        return new int[] {-1, -1};

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int[] ans = kthSmallestPrimeFraction(arr, 3);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
