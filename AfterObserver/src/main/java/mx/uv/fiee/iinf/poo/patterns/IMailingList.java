package mx.uv.fiee.iinf.poo.patterns;

/**
 * Subject interface
 */
public interface IMailingList {
    void attach (Suscriber s);
    void detach (Suscriber s);
    void notification ();
}
