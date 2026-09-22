class Solution {
    public int characterReplacement(String s, int k) {
        int len=0;
        int l=0;
        int n = s.length();
        int maxl = 0;
        int freq[] = new int[26];
        int maxf=0;
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            freq[ch-'A']+=1;
            maxf=Math.max(maxf,freq[ch-'A']);
            len=r-l+1;
            while(len-maxf>k){
                char c = s.charAt(l);
                freq[c-'A']-=1;
                l++;
                len=r-l+1;
            }
            maxl=Math.max(maxl,len);
            
        }
        return maxl;

    }
}
