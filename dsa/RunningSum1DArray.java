public class RunningSum1DArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        
        int[] result = runningSum(nums);
        for (int i : result) {
            System.out.println(i);
        }
        
    }
}
