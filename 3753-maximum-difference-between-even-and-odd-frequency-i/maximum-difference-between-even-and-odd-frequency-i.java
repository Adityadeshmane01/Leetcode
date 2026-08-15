class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;

        for(int val:map.values()){
            if(val%2==0){
                minEven=Math.min(minEven,val);
            }
            else{
                maxOdd=Math.max(maxOdd,val);
            }
        }
        return maxOdd-minEven;
    }
}