class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int k = s1.length();
        for(int i = 0;i<=s2.length()-k;i++){
            if(isequal(s1,s2.substring(i,i+k))){
                return true;
            }
        }
        return false;
    }
    public static boolean isequal(String a,String b){
        int[] arr = new int[26];
        for(int i = 0;i<a.length();i++){
            arr[a.charAt(i)-'a'] += 1;
            arr[b.charAt(i)-'a'] -= 1;
        }
        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}