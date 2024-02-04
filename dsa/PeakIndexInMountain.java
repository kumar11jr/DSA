public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

	private static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
        int end = arr.length-1;
        while(start<=end){
           int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
	    }
        return start;
    }
}
