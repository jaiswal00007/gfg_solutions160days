/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node tortoise= head;
        Node hare=head;
        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
            if(tortoise==hare){
                return true;
            }
        }
        return false;
    }
}
