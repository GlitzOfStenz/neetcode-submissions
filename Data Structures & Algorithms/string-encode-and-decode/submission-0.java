class Solution {
    int[] wordCount;
    public String encode(List<String> strs) {
        int n = strs.size();
        wordCount = new int[n];
        int idx = 0;
        for(String str:strs){
            int len = str.length();
            wordCount[idx++] = len;
        }
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        int start = 0;
        List<String> list = new ArrayList<>();
        for(int i=0;i<wordCount.length;i++){
            int val = wordCount[i];
            StringBuilder sb = new StringBuilder();
            for(int j=start;j<start+val;j++){
                sb.append(str.charAt(j));
            }
            list.add(sb.toString());
            start += val;
        }
        return list;
    }
}
