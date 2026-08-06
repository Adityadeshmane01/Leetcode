class Solution {
    int digitProd(int n){
        int prod=1;
        while(n!=0){
           prod*=n%10;
           if(prod==0){
            return 0;
           }
           n/=10; 
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
      while(digitProd(n)%t!=0){
        n++;
      }
       return n;
    }
}