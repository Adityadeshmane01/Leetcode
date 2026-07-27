class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[] arr=s.toCharArray();
        String vowels="aeiouAEIOU";

        while(start<=end){
            while(start<end && vowels.indexOf(arr[start])==-1){
                start++;
            }
            while(end>start && vowels.indexOf(arr[end])==-1){
                end--;
            }
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);  
    }
}