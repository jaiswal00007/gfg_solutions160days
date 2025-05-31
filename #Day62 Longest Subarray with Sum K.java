// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> prefix = new HashMap<>();
        int sum=0;
        int maxlen=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum==k){
                maxlen=i+1;
            }
            
            if(prefix.containsKey(sum-k)){
                maxlen= Math.max(maxlen,i-prefix.get(sum-k));
                
            }
            if(!prefix.containsKey(sum)){
                prefix.put(sum,i);
            }
        }
        
        return maxlen;
    }
}
