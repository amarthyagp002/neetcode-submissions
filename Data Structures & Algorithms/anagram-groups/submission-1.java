class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>,List<String>> map = new HashMap<>();
        
        List<List<String>> li = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<Integer> arr= new ArrayList(Collections.nCopies(26,0));
            for(int j=0;j<strs[i].length();j++){
                int ind = strs[i].charAt(j)-'a';
                arr.set(ind,arr.get(ind)+1);
            }
            if(!map.containsKey(arr)){
                map.put(arr,new ArrayList<>());
            }
            map.get(arr).add(strs[i]);
        }
        
        for(List<String> l:map.values()){
            li.add(l);
        }
        return li;

    }
}
