public class TemmoAttacking {
    public static int findPoisonDist(int[] timeseries,int duration){
        if (timeseries.length == 0) return -1;
        int count = 0;
        for (int i = 0; i < timeseries.length; i++) {
            if (i!=timeseries.length-1) {
                int diff = timeseries[i+1] - timeseries[i];
                if (diff >= duration) {
                    count+=duration;
                }
                else{
                    count += diff;
                } 
            } else {
                count+=duration;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] timeseries = {1,2,3,6};
        int duration = 3;
        System.out.println(findPoisonDist(timeseries,duration));
    }
}
