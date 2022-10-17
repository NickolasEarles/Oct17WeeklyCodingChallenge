public class IntersectingList {

    public Node intersect(List a,List b){
        Node cur=a.getHead();
        while(cur.getNextNode()!=null){
            cur.getVal();
            cur=cur.getNextNode();
        }

        cur=b.getHead();
        while(cur.getNextNode()!=null){
            if (cur.getVisited()){
                return cur;
            }
            cur=cur.getNextNode();
        }
        return null;
    }

}


