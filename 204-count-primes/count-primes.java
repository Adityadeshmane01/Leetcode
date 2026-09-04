class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean[] isPrime =new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        int count=0;
         for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                count++;
                int j = i * 2;
                while (j < n) {
                    isPrime[j] = false;
                    j = j + i;
                }
            }
        }
        
        return count;
    }
}