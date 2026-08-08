class Solution {
    public int firstMatchingIndex(String s) {
        //  idx=-1;
        int start=0;
        int end=s.length();

        while(start<end){
            if(s.charAt(start)==s.charAt(end-start-1)){
               return start;
            }
            start++;
        }
        return -1;
    }
}