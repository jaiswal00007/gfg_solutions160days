class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashMap <Integer,Integer> freq = new HashMap<>();
        
        for(int i=0;i<k;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        res.add(freq.size());
        
        for(int i=k;i<arr.length;i++){
            int el=arr[i-k];
            freq.put(el,freq.get(el)-1);
            if(freq.get(el)==0){
                freq.remove(el);
            }
            
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            res.add(freq.size());
        }
        return res;
    }
}
