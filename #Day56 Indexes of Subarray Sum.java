
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int s=0;
        int e=0;
        int sum=0;
        int n=arr.length;
        while(e<n){
            sum+=arr[e];
            
            while(sum>target && s<e){
                sum-=arr[s];
                s++;
                
            }
            if(sum==target){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(s+1);
                res.add(e+1);
                return res;
            }
            e++;
        }
        ArrayList<Integer> notFound = new ArrayList<>();
        notFound.add(-1);
        return notFound;
    }
}
