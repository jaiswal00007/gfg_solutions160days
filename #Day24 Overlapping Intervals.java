//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                String temp[] = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                String x = temp[1];
                arr[i][1] = Integer.parseInt(x);
            }
            Solution obj = new Solution();
            // The mergeOverlap function now returns a List<int[]>
            List<int[]> ans = obj.mergeOverlap(arr);

            // Printing the merged arr
            for (int[] interval : ans) {
                System.out.print(interval[0] + " " + interval[1] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List <int[]> arr1= new ArrayList();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int s=arr[0][0];
        int e=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=e){
                e=Math.max(e,arr[i][1]);
            }
            else{
                int ans[]=new int[]{s,e};
                arr1.add(ans);
                s=arr[i][0];
                e=arr[i][1];
            }
        }
        int ans[]=new int[]{s,e};
            arr1.add(ans);
        return arr1;
    }
}
