class Solution {
    public int maxDifference(String s) {
        int[] count =new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;

        for(int val:count){
            if(val>0){
            if(val%2==0){
                minEven=Math.min(minEven,val);
            }
            else{
                maxOdd=Math.max(maxOdd,val);
            }
            }
        }
        return maxOdd-minEven;
    }
}