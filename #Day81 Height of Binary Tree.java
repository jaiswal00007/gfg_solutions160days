/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null){
            return -1;
        }
        int heightLeft=height(node.left);
        int heightRight=height(node.right);
        
        return 1+ Math.max(heightLeft,heightRight);
        
    }
}
