package mx.uv.fiee.iinf.poo.patterns;

import java.util.Random;

@SuppressWarnings("DuplicatedCode")
public class Dispatcher {

    /**
     * Simula la entrega de correo nuevo al objeto mailing list para su almacenamiento
     * @param ml objeto donde entregar la información
     */
    public static void dispatch (final MailingList ml) {
        Thread t1 = new Thread (
                new Runnable () {
                    public void run () {
                        for (int i = 0; i < 5; i++) {
                            Mail mail = new Mail ();
                            mail.sender = new Random (System.currentTimeMillis ()).toString ();
                            mail.subject = new Random (System.currentTimeMillis ()).toString ();
                            mail.body = new Random (System.currentTimeMillis ()).toString ();

                            synchronized (ml) {
                                ml.newMail (mail);
                            };

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace ();
                            }
                        }
                    }
                }
        );

        Thread t2 = new Thread (
                new Runnable () {
                    public void run () {
                        for (int i = 0; i < 5; i++) {
                            Mail mail = new Mail ();
                            mail.sender = new Random (System.currentTimeMillis ()).toString ();
                            mail.subject = new Random (System.currentTimeMillis ()).toString ();
                            mail.body = new Random (System.currentTimeMillis ()).toString ();

                            synchronized (ml) {
                                ml.newMail (mail);
                            };


                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace ();
                            }
                        }
                    }
                }
        );

        Thread t3 = new Thread (
                new Runnable () {
                    public void run () {
                        for (int i = 0; i < 5; i++) {
                            Mail mail = new Mail ();
                            mail.sender = new Random (System.currentTimeMillis ()).toString ();
                            mail.subject = new Random (System.currentTimeMillis ()).toString ();
                            mail.body = new Random (System.currentTimeMillis ()).toString ();

                            synchronized (ml) {
                                ml.newMail (mail);
                            };

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace ();
                            }
                        }
                    }
                }
        );

        t1.start ();
        t2.start ();
        t3.start ();
    }

}
