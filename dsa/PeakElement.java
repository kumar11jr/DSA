public class PeakElement{
    public static int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if ((mid==0 || nums[mid]>nums[mid-1])  &&  (mid==nums.length-1 || nums[mid]>nums[mid+1])) {
                return mid;
            }
            else if(mid>0 && (nums[mid]<nums[mid-1])){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}