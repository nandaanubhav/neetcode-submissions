class Solution {
    Character escapeChar = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length()).append(escapeChar).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        while(idx < str.length()){
            int j = idx;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(idx,j));
            idx = j+1;
            j = idx + length;
            ans.add(str.substring(idx,j));
            idx = j;
        }
        return ans;
    }
}
