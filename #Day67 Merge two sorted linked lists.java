/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head= new Node(0);
        Node temp=head;
        
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1!=null){
            temp.next=head1;
        }
        else{
            temp.next=head2;
        }
        return head.next;
    }
}
