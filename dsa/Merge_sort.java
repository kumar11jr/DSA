import javax.naming.StringRefAddr;

public class Merge_sort {
    public static int[] Sort(int[] arr,int low,int mid,int high){
        int[] merged = new int[high-low+1];
        int idx1 = low;
        int idx2 = mid+1;
        int idxmerg = 0;
        while (idx1<=mid && idx2 <=high)  {
            if (arr[idx1]<=arr[idx2]) {
                merged[idxmerg++] = arr[idx1++];
            } else {
                merged[idxmerg++] = arr[idx2++];
            }
        }
        while (idx1<=mid) {
            merged[idxmerg++] = arr[idx1++];
        }
        while (idx2 <=high) {
            merged[idxmerg++] = arr[idx2++];
        }

        for (int i = 0,j = low; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
        return arr;
    }
    public static int[] divide(int arr[],int low,int high){
        if (low>=high) {
            return arr;
        }
        int mid = low + (high - low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        arr=Sort(arr,low,mid,high);
        return arr;
    }
    public static int[] sortArray(int[] nums){
        nums = divide(nums, 0, nums.length-1);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,1,5};
        // int n = arr.length-1;
        arr=sortArray(arr);
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}