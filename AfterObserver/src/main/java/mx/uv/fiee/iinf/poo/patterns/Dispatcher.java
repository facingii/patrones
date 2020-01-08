package mx.uv.fiee.iinf.poo.patterns;

import java.util.Random;

public class Dispatcher {

    /**
     * Simula la entrega de correo nuevo al objeto mailing list para su almacenamiento
     * @param ml objeto donde entregar la información
     */
    public static void dispatch (final MailingList ml) {

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                Mail mail = new Mail ();
                mail.sender  = new Random (System.currentTimeMillis ()).toString ();
                mail.subject = new Random (System.currentTimeMillis ()).toString ();
                mail.body    = new Random (System.currentTimeMillis ()).toString ();

                synchronized (ml) {
                    ml.newMail (mail);
                };

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace ();
                }
            }
        };

        Thread t1 = new Thread (runnable);
        Thread t2 = new Thread (runnable);
        Thread t3 = new Thread (runnable);

        t1.start ();
        t2.start ();
        t3.start ();
    }

}
