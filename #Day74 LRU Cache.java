class LRUCache {
    
    class Node{
        int key,value;
        Node prev,next;
        Node(int k,int v){
            key=k;
            value=v;
        }
    }
    
    public int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;

    LRUCache(int cap) {
        // code here
        this.capacity=cap;
        map=new HashMap<>();
        head= new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insertAtFront(node);
        return node.value;
    }

        
    public void put(int key, int value) {
        // your code here
        if(map.containsKey(key)){
            Node e=map.get(key);
            e.value=value;
            remove(e);
            insertAtFront(e);
        }
        else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            insertAtFront(newNode);
        }
    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insertAtFront(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}
