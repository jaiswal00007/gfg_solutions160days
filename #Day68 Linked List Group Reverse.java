/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k<=1){
            return head;
        }
        Node temp=new Node(0);
        temp.next=head;
        Node curr=head;
        Node end=temp;
        
        while(curr!=null){
            Stack<Node> stack=new Stack<>();
            Node t=curr;
            int count=0;
            
            while(t!=null && count<k){
                stack.push(t);
                t=t.next;
                count++;
            }
            if(count>0){
                Node last=end;
                while(!stack.isEmpty()){
                    last.next=stack.pop();
                    last=last.next;
                }
                last.next=t;
                end=last;
                curr=t;
            }
        }
        return temp.next;
        
    }
}
