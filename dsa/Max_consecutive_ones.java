public class Max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int prev = 0;
        for (int i : nums) {
            if(i==1){
                count++;
            }else{
                prev = Math.max(count, prev);
                count = 0;
            }
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
