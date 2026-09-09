class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }

       int n=s.length();
       String res="";

       for(int i=0;i<n;i++){

        //odd length
        int start=i;
        int end=i;

        while(start>=0 && end<n && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        String temp=s.substring(start+1,end);
        if(temp.length()>res.length()) res=temp;

    //Even length
        start=i;
        end=i+1;

        while(start>=0 && end<n && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        temp=s.substring(start+1,end);
        if(temp.length()>res.length()) res=temp;
       }
       return res;
    }
}