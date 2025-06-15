// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        int[] queens= new int[n];
        solve(0,queens,res,n);
        return res;
    }
    
    private void solve(int col,int[] queens,ArrayList<ArrayList<Integer>> res,int n){
        if(col==n){
            ArrayList<Integer> sol= new ArrayList<>();
            for(int c=0;c<n;c++){
                sol.add(queens[c]+1);
            }
            res.add(sol);
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isSafe(i,col,queens)){
                queens[col]=i;
                solve(col+1,queens,res,n);
            }
        }
    }
    private boolean isSafe(int row,int col,int[] queens){
        for(int j=0;j<col;j++){
            int k=queens[j];
            
            if(k==row || Math.abs(k-row) == Math.abs(j-col)){
                return false;
            }
        }
        return true;
    }
}
