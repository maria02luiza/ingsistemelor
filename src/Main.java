import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedNode;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedNode;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;


public class Main {
    public static void main(String[] args) {
                SimpleChainedList simpleList = new SimpleChainedList();
                for (int i = 1; i <= 10; i++) {
                    simpleList.addValue(i);
                }

                simpleList.removeNodeByValue(4);
                simpleList.removeNodeByValue(6);
                simpleList.removeNodeByValue(8);
                simpleList.removeNodeByValue(10);

                System.out.println("Lista simplu inlantuuita:");
                simpleList.listNode();


                System.out.println("Suma valorilor din lista simplu inlantuuita: " + simpleList.sum());


                System.out.println("Lista simplu inlantuuita este in ordine crescatoare? " + simpleList.isSorted());


                DoubleChainedList doubleList = new DoubleChainedList();
                for (int i = 1; i <= 10; i++) {
                    doubleList.addValue(i);
                }

                doubleList.removeNodeByValue(1);
                doubleList.removeNodeByValue(2);
                doubleList.removeNodeByValue(3);

                System.out.println("Lista dublu inlantuuita:");
                doubleList.listNodes();


                System.out.println("Suma valorilor din lista dublu inlantuuita: " + doubleList.sum());


                System.out.println("Lista dublu inlantuuita este in ordine crescatoare? " + doubleList.isSorted());
            }
        }


