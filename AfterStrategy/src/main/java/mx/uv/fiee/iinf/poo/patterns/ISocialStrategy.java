package mx.uv.fiee.iinf.poo.patterns;

/**
 * Intefaz que sirve como plantilla para los objetos Strategy que van a existir en la aplicación,
 * define los algoritmos que pueden ser utilizados dentro de la misma.
 */
public interface ISocialStrategy {
    void connectTo (String name);
}
