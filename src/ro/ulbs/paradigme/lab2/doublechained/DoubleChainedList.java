package ro.ulbs.paradigme.lab2.doublechained;
import ro.ulbs.paradigme.lab2.api.MyList;
public class DoubleChainedList {
    private DoubleChainedNode head;
    private DoubleChainedNode tail;

    public DoubleChainedList() {
        this.head = null;
        this.tail = null;
    }

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
            tail = newNode;
        }
    }

    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null; // Nodul nu a fost găsit
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            if (head.getNextNode() != null) {
                head.getNextNode().setPrevNode(null);
            }
            head = head.getNextNode();
            return;
        }

        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                if (current.getPrevNode() != null) {
                    current.getPrevNode().setNextNode(current.getNextNode());
                }
                if (current.getNextNode() != null) {
                    current.getNextNode().setPrevNode(current.getPrevNode());
                }
                return;
            }
            current = current.getNextNode();
        }
    }

    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }
    public boolean isSorted() {
        DoubleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }

    public int sum() {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }


}

