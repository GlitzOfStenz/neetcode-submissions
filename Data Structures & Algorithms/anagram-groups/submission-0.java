class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            List<String> temp = entry.getValue();
            list.add(temp);
        }
        return list;
    }
}
