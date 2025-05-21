// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]<target){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
