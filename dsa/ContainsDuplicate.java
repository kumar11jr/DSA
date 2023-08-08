import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containDuplicate(int[] nums){

        // Approach one
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j] &&  i!=j) {
        //             return true;
        //         }
        //     }
        // }
        // return false;


        // Approach Second
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length-1; i++) {
        //     if (nums[i]==nums[i+1]) {
        //         return true;
        //     }
        // }
        // return false;


        // Approach Third
        HashSet<Integer> has = new HashSet<>();
        for (int integer : nums) {
            if (has.contains(integer)) {
                return true;
            }
            has.add(integer);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containDuplicate(nums));
    }
}
