package wsb.po.tabliceilisty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Listy {


    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<Integer>();

        Double [] doublesArray = {1.2, 3.4, 5.2, 6.4, 7.9};

        //ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(doublesArray));
        ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(1.2, 3.4, 5.2, 6.4, 7.9));

        ArrayList<String>  strings = new ArrayList<String>();

        ints.add(2);
        ints.add(7);
        ints.add(23);
        ints.add(98);

        strings = new ArrayList<String>(Arrays.asList("To jest jakies zdanie".split(" ")));

        for (int i =0; i < ints.size(); i++) {
            System.out.println("int od "+i+" = "+ints.get(i));
        }
        for (int i =0; i < doubles.size(); i++) {
            System.out.println("double od "+i+" = "+doubles.get(i));
        }
        for (int i =0; i < strings.size(); i++) {
            System.out.println("string od "+i+" = "+strings.get(i));
        }

        for (int i : ints) {
            System.out.println("int = "+i);
        }
        for (double d : doubles) {
            System.out.println("double = "+d);
        }
        for (String s : strings) {
            System.out.println("string = "+s);
        }

        Collections.reverse(strings);
        for (String s : strings) {
            System.out.println("string = "+s);
        }

    }

}
