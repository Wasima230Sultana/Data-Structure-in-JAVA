
import java.util.LinkedList;

class LLC {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.add("list");
        list.addFirst("This");
        System.out.println(list);
        System.out.println(list.size());
        for (int idx = 0; idx < list.size(); idx++) {
            System.out.print(list.get(idx) + " -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
