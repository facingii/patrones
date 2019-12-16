package mx.uv.fiee.iinf.poo.patterns;

/**
 * Invoker
 *
 * El invoker nos permite establecer la estrategia que deseamos utilizar en algún punto de la aplicación.
 * Las acciones (algoritmos) definidas en la interfaz debe ser ejecutadas únicamente desde aqui
 */
public class SocialContext {
    ISocialStrategy strategy; //referencia al objeto Strategy seleccionado

    public void setStrategy (ISocialStrategy strategy) {
        this.strategy = strategy;
    }

    public void connect (String name) {
        this.strategy.connectTo (name);
    }

}
