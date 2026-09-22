class Solution {
    public boolean isPalindrome(String s) {
        String b =s.replaceAll("[^a-zA-Z0-9]","");
        String a =b.toLowerCase();
        int j=a.length()-1;
        for(int i=0 ; i<a.length()/2 ;i++){
            
                if(a.charAt(i)!=a.charAt(j)){
                    return false;
                }
                j--;

        }
        return true;
        
    }
}
