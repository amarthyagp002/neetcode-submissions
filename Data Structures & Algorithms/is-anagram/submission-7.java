class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0 ;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int x=map.get(s.charAt(i));
                x++;
                map.put(s.charAt(i),x);
                continue;
            }
            map.put(s.charAt(i),1);
        }
        for(int i=0 ;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int x=map.get(t.charAt(i));
                x--;
                map.put(t.charAt(i),x); 
            }   
        }
        
        for(Integer v:map.values()){
            if(v!=0){
                return false;
            }
        }
        return true;

    }
}
