class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> chars=new HashSet<>();
        int count=0;
        for(char ch:jewels.toCharArray()){
            chars.add(ch);
        }

        for(char ch:stones.toCharArray()){
            if(chars.contains(ch)){
                count++;
            }
        }
        return count;
    }
}