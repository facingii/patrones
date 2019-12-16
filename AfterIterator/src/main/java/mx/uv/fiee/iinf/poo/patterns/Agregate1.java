package mx.uv.fiee.iinf.poo.patterns;

import java.util.ArrayList;

public class Agregate1 implements Agregate {

    //
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     *
     * @return
     */
    public Iterator createIterator () {
        return new Iterator1 ();
    }

    /**
     *
     * @param item
     */
    public void add (int item) {
        list.add (item);
    }

    class Iterator1 implements Iterator {
        int position = 0; //variable que mantiene la posición en la colección

        /**
         *
         * @return
         */
        public boolean hasNext () {
            return list.size () > 0 && position < list.size ();
        }

        /**
         *
         * @return
         */
        public Integer next () {
            Integer foo =  list.get (position);
            position++;

            return foo;
        }

    }

}
