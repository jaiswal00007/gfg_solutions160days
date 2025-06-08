/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        if(head==null){
            return null;
            
        }
        Node curr=head;
        while(curr!=null){
            Node clone=new Node(curr.data);
            clone.next=curr.next;
            curr.next=clone;
            curr=clone.next;
        }
        
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        Node temp= new Node(0);
        Node dummy=temp;
        curr=head;
        
        while(curr!=null){
            Node clone=curr.next;
            dummy.next=clone;
            dummy=clone;
            curr.next=clone.next;
            curr=curr.next;
        }
        return temp.next;
    }
}
