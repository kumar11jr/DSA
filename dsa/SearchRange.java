import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] array = {2,3,4,4,4,5,6};
        int target = 4;
        int[] result = searchRange(array, target);
        System.out.println(Arrays.toString(result));
    }



    private static int[] searchRange(int[] nums,int target){
        int[] result = {-1,-1};
        result[0] = findOccurance(nums, target, true);
        result[1] = findOccurance(nums, target, false);
        return result;
    }


    private static int findOccurance(int[] nums,int target,boolean firstOccurance){
        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                index = mid;
                if(firstOccurance){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return index;
    };

}
