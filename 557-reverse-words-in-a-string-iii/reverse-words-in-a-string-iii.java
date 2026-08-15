class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ans="";

        for(String w:arr){
            int start=0;
            int end=w.length()-1;

            while(start<=end){
                ans+=w.charAt(end--);
            }
            ans+=" ";
        }
        return ans.trim();
    }
}