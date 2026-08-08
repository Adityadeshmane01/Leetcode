class Solution {
    public int firstMatchingIndex(String s) {
        StringBuilder str=new StringBuilder(s);

        int start=0;
        int end=str.length();

        while(start<end){
            if(str.charAt(start)==str.charAt(end-start-1)){
                return start;
            }
            start++;
        }
        return -1;
    }
}