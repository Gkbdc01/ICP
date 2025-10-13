        int lo = 0;
        int hi =  potions.length-1;
        while(lo<=hi){
        int cnt = potions.length;
            int mid = lo +(hi-lo)/2;
            if(potions[mid]>=t){
                cnt = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
    public static int count(long t , int[] potions){
    }
        return arr;
        }
            }
                arr[i] = count(t+1,potions);
            }
        }
        return potions.length - cnt;
    }