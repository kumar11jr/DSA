import java.util.*;

public class median_of_two_array{
    public static double median(int[] arr1,int[] arr2){
        int n = arr1.length + arr2.length;
        // System.out.println(leng);
        
        int[] sorted = new int[n];
        
        System.arraycopy(arr1, 0, sorted, 0, arr1.length);
        System.arraycopy(arr2, 0, sorted, arr1.length, arr2.length);
        
        Arrays.sort(sorted);
        
        // for (int i : sorted) {
        //     System.out.println(i);
        // }

        if (n%2==0) return (float)(sorted[n/2-1] + sorted[n/2])/2;
        else return sorted[n/2];
        
    }
    public static void main(String[] args) {
       int[] arr1 = {2,4,6};
       int[] arr2 = {3,5,7};

    //    System.out.println(arr2[1]);
    //    System.out.println(arr1[1]);
       double ans = median(arr1,arr2);
       System.out.println(ans);
    }
}