class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        int n=word.length();

        for(int i=0;i<n;i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                count++;
            }
        }
        if(count==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')) return true;
        else if(count==0) return true;
        else if(count==word.length()) return true;
        else return false;
    }
}