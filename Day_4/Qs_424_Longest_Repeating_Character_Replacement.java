class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int max = 0;
        int maxs = 0;
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            max = Math.max(max,freq[s.charAt(i)-'A']);
            if(i-l+1-max>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxs =  Math.max(maxs,i-l+1);
        }
        return maxs;
    }
}