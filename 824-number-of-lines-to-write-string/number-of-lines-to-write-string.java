class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        char[] chars=s.toCharArray();
        int line=0;
        int sum=0;

        for(char ch:chars){
            int r=ch-'a';

            if(sum+widths[r]>100){
                sum=0;
                line++;
            }
            sum+=widths[r];
        }
        int[] ans=new int[2];
        if(sum!=0) ans[0]=line+1;
        else ans[0]=line;

        ans[1]=sum;

        return ans;
    }
}