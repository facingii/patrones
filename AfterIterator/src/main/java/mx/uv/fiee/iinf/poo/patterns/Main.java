package mx.uv.fiee.iinf.poo.patterns;

/**
 * Clase cliente
 */
public class Main {
    public static void main (String [] args) {
        Agregate1 a = new Agregate1 ();
        a.add (1);
        a.add (2);
        a.add (3);
        a.add (4);
        a.add (5);

        Iterator i = a.createIterator ();
        while (i.hasNext ()) {
            System.out.println (i.next ());
        }
    }
}
