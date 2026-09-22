class Solution {
    public String minWindow(String s, String t) {
        int n=t.length();
        int len=s.length();
        int minl=s.length()+1;
        int loc1=-1;
        int loc2=-1;
        String so=s;
        // s=s.toUpperCase();
        // t=t.toUpperCase();
        
        for(int i=0;i<s.length();i++){
            int freq[] = new int[128];
            for(int k=0;k<t.length();k++){
            char ch = t.charAt(k);
            freq[ch]+=1;
             }
             
            int count =0;
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(freq[ch]>0){
                    count++;
                    freq[ch]-=1;
                }
                if(count==n){
                    len=j-i+1;
                    if(len<minl){
                        minl=len;
                        loc1=i;
                        loc2=j;
                    }
                    break;
                }
            }
            
        }
        String x="";
        if(loc1==-1 || loc2==-1){
            return "";
        }
        return so.substring(loc1,loc2+1);
        
    }
}
