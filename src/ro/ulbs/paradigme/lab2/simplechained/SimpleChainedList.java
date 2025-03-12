package ro.ulbs.paradigme.lab2.simplechained;
import ro.ulbs.paradigme.lab2.api.MyList;

public class SimpleChainedList {
    private SimpleChainedNode head;


    public SimpleChainedList() {
        this.head = null;
    }
    public void addValue(int value){
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if(head==null){
            head = newNode;
        }
        else{
            SimpleChainedNode current = head;
            while(current.getNextNode()!=null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode current = head;
        while(current !=null){
            if(current.getValue()==value){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }
    public void removeNodeByValue(int value) {
        if(head==null)
            return;
        if(head.getValue()==value){
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode current = head;
        while(current.getNextNode()!=null){
            if(current.getNextNode().getValue()==value){
                current.setNextNode(current.getNextNode().getNextNode());
                return;
            }
            current = current.getNextNode();
        }
    }
    public void listNode(){
        SimpleChainedNode current = head;
        while(current!=null){
            System.out.println(current.getValue());
            current = current.getNextNode();

        }
        System.out.println();
    }
    //@Override
    public boolean isSorted() {
        SimpleChainedNode current = head;
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
        SimpleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }


}
