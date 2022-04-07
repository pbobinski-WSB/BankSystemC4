package wsb.po.tabliceilisty;

public class Tablice {

    public static void main(String[] args) {

        int [] ints = new int[10];

        Double [] doubles = {1.2, 3.4, 5.2, 6.4, 7.9};

        String [] strings;

        ints[0] = 2;
        ints[1] = 7;
        ints[2] = 23;
        ints[3] = 98;

        strings = "To jest jakies zdanie".split(" ");

        for (int i =0; i < ints.length; i++) {
            System.out.println("int od "+i+" = "+ints[i]);
        }
        for (int i =0; i < doubles.length; i++) {
            System.out.println("double od "+i+" = "+doubles[i]);
        }
        for (int i =0; i < strings.length; i++) {
            System.out.println("string od "+i+" = "+strings[i]);
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

    }

}
