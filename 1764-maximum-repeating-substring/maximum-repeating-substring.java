class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String curr="";
        for(int i=0;i<sequence.length();i++){
             curr=curr+word;

            if(sequence.contains(curr)){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}