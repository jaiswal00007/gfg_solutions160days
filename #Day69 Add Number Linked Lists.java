/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        num1=reverse(num1);
        num2=reverse(num2);
        
        Node temp= new Node(-1);
        Node curr=temp;
        int carry=0;
        
        while(num1!=null || num2!=null || carry!=0){
            int sum=carry;
            if(num1!=null){
                sum+=num1.data;
                num1=num1.next;
            }
             if(num2!=null){
                sum+=num2.data;
                num2=num2.next;
            }
            carry=sum/10;
            int n=sum%10;
            curr.next=new Node(n);
            curr=curr.next;
        }
        Node res=reverse(temp.next);
        while(res!=null && res.data==0 && res.next!=null){
            res=res.next;
        }
        
        return res;
        
    }
}
