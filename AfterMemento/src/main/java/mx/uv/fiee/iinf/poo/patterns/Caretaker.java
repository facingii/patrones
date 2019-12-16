package mx.uv.fiee.iinf.poo.patterns;

import java.util.Stack;

/**
 * Almacena los memementos en una pila de modo que cada llamada a get elimina dicha instantanea
 * del histórico
 */
public class Caretaker {

    Stack<IMemento> mementos;

    public Caretaker () {
        mementos = new Stack<>();
    }

    public void add (IMemento memento) {
        mementos.add (memento);
    }

    public IMemento get () {
        return mementos.pop ();
    }

}
