public class removeElement {
    public static int removeElem(int[] nums,int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElem(nums, 3));
    }
}
