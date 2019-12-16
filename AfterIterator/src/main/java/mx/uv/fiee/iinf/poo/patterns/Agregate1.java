package mx.uv.fiee.iinf.poo.patterns;

import java.util.ArrayList;

public class Agregate1 implements Agregate {

    //almacén de valores enteros
    private ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     * devuelve un objeto iterador que conoce la estructura de la colección y puede recorrela
     * @return nuevo objeto iterador
     */
    public Iterator createIterator () {
        return new Iterator1 ();
    }

    /**
     * agrega un elemento a la colección
     * @param item elemento nuevo
     */
    public void add (int item) {
        list.add (item);
    }

    class Iterator1 implements Iterator {
        int position = 0; //variable que mantiene la posición en la colección

        /**
         * verifica si existen elementos en la colección que falte recorrer
         * @return verdadero si existen elementos por recorrer, falso en caso contrario
         */
        public boolean hasNext () {
            return list.size () > 0 && position < list.size ();
        }

        /**
         * extrae el último valor introducido a la colección
         * @return valor almacenado
         */
        public Integer next () {
            Integer foo =  list.get (position);
            position++;

            return foo;
        }

    }

}
