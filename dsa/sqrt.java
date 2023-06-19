public class sqrt {
    public static int mysqrt(int num){
        int squareroot = num / 2;
		int temp;
		do {
		    temp = squareroot;
			squareroot = (temp + (num / temp))/2;
		} while((temp - squareroot) != 0);
		
        return squareroot;
	}
    public static int mysqrt2(int x){
        if (x<2) {
            return x;
        }
        int first = 1, last = x;
        while (first<last) {
            int mid = first + (last - first)/2 ;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x/mid) {
                last = mid-1;
            } else{
                first = mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int x = 26;
        System.out.println(mysqrt2(x));
    }
}
