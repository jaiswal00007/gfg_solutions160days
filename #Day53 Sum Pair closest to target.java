// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int s=0;
        int e= arr.length-1;
        int min_dif=Integer.MAX_VALUE;
        List<Integer> l = new ArrayList<>();
        while(s<e){
            int sum= arr[s]+arr[e];
            int dif= Math.abs(target-sum);
            if(dif<min_dif){
                min_dif=dif;
                l= Arrays.asList(arr[s],arr[e]);
            }
            if(sum<target){
                s++;
            }
            else{
                e--;
            }
        }
        return l;
        
    }
}
