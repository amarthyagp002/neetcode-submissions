class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        int check[]=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            boolean flag=true;
            for(int j=0;j<s1.length();j++){
                check[s2.charAt(j+i)-'a']++;
            }
            for(int k=0;k<26;k++){
                if(freq[k]!=check[k]){
                    flag= false;
                }
                check[k]=0;
            }
            if(flag){
                return true;
            }
        }
        return false;
       
        
    }
}
