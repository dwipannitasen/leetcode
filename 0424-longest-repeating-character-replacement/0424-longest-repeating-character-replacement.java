class Solution {
    public int characterReplacement(String s, int k) {
       int[] arr = new int[26];
       int res = 0;
       int maxf = 0;
       int l=0, r=0;
       while(r<s.length()){
        arr[s.charAt(r)-'A']++;

        maxf = Math.max(maxf, arr[s.charAt(r)-'A']);
        if(r-l+1-maxf > k){
            arr[s.charAt(l) - 'A']-- ;
            l++;
        }

        res = Math.max(res, r-l+1);
        r++;
       } 
       return res;
    }
}