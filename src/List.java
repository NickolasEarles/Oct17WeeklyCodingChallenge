class List{
    private Node head;
    private Node tail;
    private int size=0;

    public List(){}

    public List(int val){add(val);}

    public List(Node next){add(next);}

    public void add(int val){

        Node next = new Node(val);
        if(tail!=null){
            tail.setNextNode(next);
        }
        tail=next;
        if (size==0){head=tail;}
        size++;
    }

    public void add(Node next) {
        if (tail != null){
            tail.setNextNode(next);
        }
        tail=next;
        if (size==0){head=tail;}
        size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}