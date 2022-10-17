public class Stack {
    private Node head;
    private int size=0;

    public Stack(){}

    public Stack(int newNode){
        push(newNode);
    }

    public Stack(Node newNode){
        push(newNode);
    }

    public void push(Node next){
        next.setNextNode(head);
        head=next;
        size++;
    }

    public void push(int next){
        Node newNode= new Node(next,head);
        head=newNode;
        size++;
    }

    public Node pop(){
        try {
            if (size == 0) {
                throw new RuntimeException();
            }
            Node poppedNode = head;
            head = head.getNextNode();
            size--;
            return poppedNode;
        }catch (RuntimeException e){
            System.out.println("ERROR: No values are in the Stack.");
            return null;
        }
    }

    public Node max(){
        try {
            if(size==0){throw new RuntimeException();}
            Node maxNode=null;
            int max=0;
            Node cur=head;
            while(cur!=null){
                if (cur.getVal()>max){
                    max= cur.getVal();
                    maxNode=cur;
                }
                cur=cur.getNextNode();
            }
            return maxNode;
        }catch (RuntimeException e){
            System.out.println("ERROR: No values are in the Stack.");
            return null;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
