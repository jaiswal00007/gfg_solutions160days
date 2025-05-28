class Solution {
    public int maxWater(int arr[]) {
        // code here
        int s=0;
        int e=arr.length-1;
        int maxs=0;
        int maxe=0;
        int t=0;
        
        while(s<e){
            if(arr[s] <= arr[e]){
                if(arr[s]>=maxs){
                    maxs=arr[s];
                }
                else{
                    t+=maxs-arr[s];
                }
                s++;
            }
            else{
                if(arr[e]>=maxe){
                    maxe=arr[e];
                }
                else{
                    t+=maxe-arr[e];
                }
                e--;
                
            }
        }
        return t;
    }
}
