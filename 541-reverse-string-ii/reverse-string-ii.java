class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str=new StringBuilder(s);

       for(int i=0;i<str.length();i+=2*k){
        int start=i;
        int end=Math.min(i+k-1,str.length()-1);
        
        while(start<end){
            char temp=str.charAt(start);
            str.setCharAt(start,str.charAt(end));
            str.setCharAt(end,temp);

            start++;
            end--;
        }
       }
       return new String(str);
    }
}