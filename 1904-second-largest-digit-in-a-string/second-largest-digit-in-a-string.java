class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int second=-1;

        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                int digit=ch-'0';

                if(digit>largest){
                    second=largest;
                    largest=digit;
                }
                else if(digit>second && digit!=largest){
                    second=digit;
                }
            }
        }
        return second;
    }
}