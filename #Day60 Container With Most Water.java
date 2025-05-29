// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int l=0;
        int r=arr.length-1;
        int maxArea=0;
        
        while(l<r){
            int h=Math.min(arr[l],arr[r]);
            int w=r-l;
            int k=h*w;
            maxArea=Math.max(maxArea,k);
            
            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }
            
        }
        return maxArea;
    }
}
