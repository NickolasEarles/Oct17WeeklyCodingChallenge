public class Tester {
    public static void main(String[] args) {
        System.out.println("-----Stack test-----");

        Stack tStack= new Stack(1);
        tStack.push(5);
        tStack.push(4);
        tStack.push(3);
        tStack.push(2);

        Stack jStack= new Stack();

        System.out.println("TStack max = "+tStack.max());
        System.out.println("TStack pop = "+tStack.pop());
        System.out.println("");
        System.out.println("JStack max = "+jStack.max());
        System.out.println("JStack pop = "+jStack.pop());
        System.out.println("--------------------");

        System.out.println("---Intersect test---");
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        List a=new List(node1);
        a.add(node2);
        a.add(node3);
        a.add(node4);
        a.add(node5);
        a.add(node6);

        List b=new List(1);
        b.add(3);
        b.add(node5);
        b.add(7);

        IntersectingList test =new IntersectingList();

        System.out.println(test.intersect(a,b));

        System.out.println("--------------------");
    }
}
