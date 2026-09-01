class Solution {
    public int countSegments(String s) {
        String[] arr=s.split(" ");
        int count=0;
        
        for(String word:arr){
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;
    }
}