package mx.uv.fiee.iinf.poo.patterns;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox {

    private final List<Integer> list = new ArrayList<>();

    public void add (int in) {
        list.add (in);
    }

    public List<Integer> getData () {
        return list;
    }
}
