package mx.uv.fiee.iinf.poo.patterns;

import java.util.Vector;

/**
 * Subject class
 */
public class MailingList implements IMailingList {
    private Vector<Suscriber> suscribers;
    private Vector<Mail> mails;

    /**
     * Constructor
     */
    public MailingList() {
        suscribers = new Vector<Suscriber> ();
        mails = new Vector<Mail> ();
    }

    /**
     * Ha llegado correo nuevo, el objeto se almace y se avisa a los suscriptores del cambio
     * @param mail
     */
    public void newMail (Mail mail) {
        mails.add (mail);
        notification ();
    }

    /** métodos definidos por la interface que deben ser implementados **/


    public void attach (Suscriber s) {
        suscribers.add (s);
    }

    public void detach (Suscriber s) {
        suscribers.remove (s);
    }

    /**
     * Por cada suscriptor enlazado se invoca su método update
     */
    public void notification () {
        for (Suscriber s : suscribers) {
            s.update (mails.get (mails.size () - 1));
        }
    }
}
