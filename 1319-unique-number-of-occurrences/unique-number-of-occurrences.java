class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> unique=new HashSet<>();

        // for(int num:arr){
        //     unique.add(num);
        // }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i:map.keySet()){
            if(unique.contains(map.get(i))){
                return false;
            }
            unique.add(map.get(i));
        }
        return true;
    }
}