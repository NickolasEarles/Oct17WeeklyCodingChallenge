public class Node {
    private int val;
    private Node nextNode;
    private Boolean visited;

    public Node(int val,Node nextNode){
        this.val=val;
        this.nextNode=nextNode;
        visited=false;
    }
    public Node(int val){
        this.val=val;
        nextNode=null;
        visited=false;
    }
    public int getVal() {
        visited=true;
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return ""+val;
    }
}
