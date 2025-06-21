/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int maxDiameter=0;
    int diameter(Node root) {
        // Your code here
        height(root);
        return maxDiameter;
    }
    
    int height(Node node){
        if(node==null){
            return 0;
        }
        int heightLeft=height(node.left);
        int heightRight=height(node.right);
        
        maxDiameter= Math.max(maxDiameter,heightLeft+heightRight);
        
        return 1+Math.max(heightLeft,heightRight);
    }
}
