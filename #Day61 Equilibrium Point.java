class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        for(int n:arr){
            total+=n;
        }
        int total2=0;
        for(int i=0;i<arr.length;i++){
            int k=total-total2-arr[i];
            if(total2==k){
                return i;
            }    
            total2+=arr[i];
        }
        return -1;
    }
}
