import java.util.Arrays;

public class kLargestElement {
    public static int largestK(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];

    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(largestK(nums,2));
    }
}
