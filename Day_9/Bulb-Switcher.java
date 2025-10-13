class Solution {
    public int bulbSwitch(int n) {
        if(n == 0){
            return 0;
        }
        int lo = 1;
        int hi = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
        }
            if(mid <=n/mid){
                max = mid;
            }else{
        int max = 0;
                lo = mid+1;
                hi = mid-1;
            }
    }
        return max;