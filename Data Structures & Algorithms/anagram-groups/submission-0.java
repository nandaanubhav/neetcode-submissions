class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap<>();
        for(String str: strs) {
            String charKey = getCharFrequency(str);
            anagrams.computeIfAbsent(charKey, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> answer = new ArrayList<>();
        anagrams.forEach((key, valueList) -> {
            answer.add(valueList);
        });
        return answer;
    }

    private String getCharFrequency(String word) {
        int[] alphabetFreq = new int[26];
        for(char c: word.toCharArray()) {
            alphabetFreq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int freq: alphabetFreq) {
            sb.append(freq).append('#');
        }
        return sb.toString();
    }
}
