package mx.uv.fiee.iinf.poo.patterns;

import java.util.Vector;

/**
 * Subject class concrete
 *
 * Representa al objeto que será observado por los suscriptores.
 * Implementa la interfaz IMailingList y define la lógica de los métodos abstractos
 */
public class MailingList implements IMailingList {
    private Vector<Suscriber> suscribers; //colección de suscriptores
    private Vector<Mail> mails; //colección de correos recibidos

    /**
     * Constructor
     */
    public MailingList () {
        suscribers = new Vector<Suscriber> ();
        mails = new Vector<Mail> ();
    }

    /**
     * Ha llegado correo nuevo, el objeto se almace y se avisa a los suscriptores del cambio
     * @param mail Objeto Mail recibido
     */
    public void newMail (Mail mail) {
        mails.add (mail);
        notification ();
    }

    /** métodos definidos por la interface que deben ser implementados **/

    /**
     * Agrega un suscriptor a la colección
     * @param s Objeto Suscriber a almacenar
     */
    public void attach (Suscriber s) {
        suscribers.add (s);
    }

    /**
     * Quita un suscriptor de la colección
     * @param s Objeto Suscriber a remover
     */
    public void detach (Suscriber s) {
        suscribers.remove (s);
    }

    /**
     * Por cada suscriptor enlazado se invoca a su método update
     */
    public void notification () {
        for (Suscriber s : suscribers) {
            s.update (mails.get (mails.size () - 1));
        }
    }
}
