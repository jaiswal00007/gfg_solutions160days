//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n){
            return -1;
        }
        int low=Arrays.stream(arr).max().getAsInt();
        int high =Arrays.stream(arr).sum();
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(arr,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static boolean isValid(int arr[],int k, int limit){
        int students=1;
        int pages=0;
        for(int i:arr){
            if(pages+i >limit){
                students++;
                pages=i;
                if(students>k){
                    return false;
                }
            }
            else{
                pages+=i;
            }
        }
        return true;
    }
}
