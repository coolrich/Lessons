package lesson19.atHome.e2.shopParts;

import java.util.ArrayList;

/**
 * Coming soon
 */
public class MenuSections {
    private Node section;

    public MenuSections() {
        section = new Node();
    }

    public void addSection(String name) {

    }

    private static class Node {
        private Node previous;
        private ArrayList<Node> next;

        public Node() {
            this.previous = null;
            this.next = new ArrayList<>();
        }
    }
}
