class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max =  0;
        int cnt = 0;
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                cnt++;
            }else{
                max = Math.max(cnt,max);
                while(set.contains(s.charAt(j)) && set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
                cnt = i-j+1;
            }
        }
        max = Math.max(cnt,max);
        return max;
    }
}