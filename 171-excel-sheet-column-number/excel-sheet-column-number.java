class Solution {
    public int titleToNumber(String s) {
        long ans=0;

        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'A'+1;
            ans=ans*26+val;
        }
        return (int)ans;
    }
}