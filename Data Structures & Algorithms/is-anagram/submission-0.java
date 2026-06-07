class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charSet = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i=0; i<s.length(); ++i) {
            charSet[sArray[i]-'a']++;
            charSet[tArray[i]-'a']--;
        }
        for(int i: charSet) {
            if(i != 0) return false;
        }
        return true;
    }
}
