class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int first=0;
        int sec=0;
        while(first<word1.length() && sec<word2.length()){
            ans.append(word1.charAt(first++));
            ans.append(word2.charAt(sec++));

        }
        while(first<word1.length()){
             ans.append(word1.charAt(first++));
        }
        while(sec<word2.length()){
            ans.append(word2.charAt(sec++));
        }
        return ans.toString();
    }
}