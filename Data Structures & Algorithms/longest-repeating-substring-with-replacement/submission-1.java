class Solution {
    public int characterReplacement(String s, int k) {
        int len=0;
        int n = s.length();
        int maxl = 0;
        for(int i=0 ;i< n ;i++){
            int freq[] = new int[26];
            int maxf = 0;
            for(int j=i ; j<n;j++){
                char ch = s.charAt(j);
                freq[ch-'A']+=1;
                if(freq[ch-'A']>maxf){
                    maxf=freq[ch-'A'];
                }
                len =j-i+1;
                if(len-maxf<=k){
                    maxl=Math.max(maxl,len);
                }

            }
        }
       return maxl;

    }
}
