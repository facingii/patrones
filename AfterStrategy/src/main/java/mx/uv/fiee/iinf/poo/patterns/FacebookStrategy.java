package mx.uv.fiee.iinf.poo.patterns;

/**
 * Objeto strategy concreto
 *
 * Reeimplementa el algoritmo definido en la interfaz con lógica apropiada al tipo de estrategia
 */
public class FacebookStrategy  implements ISocialStrategy {
    @Override
    public void connectTo (String name) {
        String foo = String.format ("Connecting to %s using Facebook!", name);
        System.out.println (foo);
    }
}
