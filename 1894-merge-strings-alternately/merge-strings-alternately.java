class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int first=0;
        int sec=0;
        while(first<word1.length() && sec<word2.length()){
            ans+=word1.charAt(first++);
            ans+=word2.charAt(sec++);
        }
        while(first<word1.length()){
            ans+=word1.charAt(first++);
        }
        while(sec<word2.length()){
            ans+=word2.charAt(sec++);
        }
        return ans;
    }
}