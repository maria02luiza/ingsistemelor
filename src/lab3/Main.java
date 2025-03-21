package lab3;

import ro.ulbs.paradigme.lab2.Form;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

import java.util.*;


public class Main {
    /*public static <PasswordMMaker> void main(String[] args) {
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

                //3.6.1
            // Creăm câteva instanțe ale clasei Form
             Form form1 = new Form();
             Form form2 = new Form();
             Form form3 = new Form();
             Form form4 = new Form();
             System.out.println("Numarul de instante create: " + Form.getCounter() );
             //3.6.2-calasa passwordmaker
        // Metoda main pentru testare

            //PasswordMMaker passwordMaker = new PasswordMMaker("UserName");
           // String password = passwordMaker.getPassword("UserName");
           // System.out.println("Parola generată: " + password);
*/

    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        List<Integer> y = new ArrayList();
        for(int i=0;i<7;i++) {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        //a

        List<Integer> xPlusY = new ArrayList<>(); //a
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        //b

        Set<Integer> zSet = new TreeSet<>(x); //b
        zSet.retainAll(y);
        List<Integer> zSetList = new ArrayList<>(zSet);
        Collections.sort(zSetList);

        //c

        Set<Integer> xSet = new TreeSet<>(x);
        Set<Integer> ySet = new TreeSet<>(y);
        xSet.removeAll(ySet);
        List<Integer> xMinusY = new ArrayList<>(xSet);
        Collections.sort(xMinusY);

        //d
        int  P = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int nr : xPlusY) {
            if (nr <= P) {
                xPlusYLimitedByP.add(nr);
            }
        }

        System.out.println("xPlusY: " + xPlusY);
        System.out.println("zSet: " + zSetList);
        System.out.println("xMinusY: " + xMinusY);
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);
    }

}


