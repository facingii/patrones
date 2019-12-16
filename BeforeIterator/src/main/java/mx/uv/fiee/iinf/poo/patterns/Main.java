package mx.uv.fiee.iinf.poo.patterns;

import java.util.Collection;

public class Main {

    public static void main (String [] args) {
        IntegerBox box = new IntegerBox ();

        for (int i = 9; i > 0; i--) {
            box.add (i);
        }

        Collection<Integer> integerList = box.getData ();

        for (Object item: integerList) {
            System.out.println (item + " ");
        }

        System.out.println ();
        integerList.clear ();

        integerList = box.getData ();
        System.out.println ("Size of data is: " + integerList.size ());
    }

}
