class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
         // Convert banned array to a HashSet for fast lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Replace non-letters with spaces and convert to lowercase
        String cleaned = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : cleaned.trim().split("\\s+")) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        String ans = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}