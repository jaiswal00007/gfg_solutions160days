// User function Template for Java

class Solution {
    static boolean[] [] row= new boolean[9][10];
    static boolean[] [] col= new boolean[9][10];
    static boolean[] [] box= new boolean[9][10];
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        for(int i=0;i<9;i++){
            Arrays.fill(row[i],false);
            Arrays.fill(col[i],false);
            Arrays.fill(box[i],false);
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num=mat[i][j];
                if(num!=0){
                    row[i][num]=true;
                    col[j][num]=true;
                    box[boxIndex(i,j)][num]=true;
                }
            }
        }
        solve(mat,0,0);
    }
    
    static boolean solve(int[][] mat,int i,int j){
        if(i==9){
            return true;
        }
        if(j==9){
            return solve(mat,i+1,0);
        }
        if(mat[i][j]!=0){
            return solve(mat,i,j+1);
        }
        
        for(int num=1;num<=9;num++){
            int boxIdx=boxIndex(i,j);
            if(!row[i][num] && !col[j][num] && !box[boxIdx][num]){
                mat[i][j]=num;
                row[i][num]=true;
                col[j][num]=true;
                box[boxIdx][num]=true;
                
                if(solve(mat,i,j+1)){
                    return true;
                }
                
                mat[i][j]=0;
                row[i][num]=false;
                col[j][num]=false;
                box[boxIdx][num]=false;
            }
        }
        return false;
    }
    static int boxIndex(int i,int j){
        return (i/3)*3+(j/3);
    }
}

