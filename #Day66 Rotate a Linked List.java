/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null || k==0){
            return head;
        }
        
        Node temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        k=k%len;
        if(k==0){
            temp.next=null;
            return head;
        }
        Node curr=head;
        for(int i=0;i<k-1;i++){
           curr=curr.next;
        }
        Node head2=curr.next;
        curr.next=null;
        return head2;
    }
}
