class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        for( int i=0;i<s.length();i++){
            int arr[] = new int[26];
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                arr[ch-'A']+=1;
                int max=0;
                for(int m:arr){
                    if(m>max){
                        max=m;
                    }
                }
                if(j-i+1-max<=k){
                    if(j-i+1>l){
                        l=j-i+1;
                    }
                    
                }



            }
        }
        return l;

    }
}
