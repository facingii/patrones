package mx.uv.fiee.iinf.poo.patterns;

public class Main {

    public static void main (String [] args) {
        MailingList ml = new MailingList (); //instancia a la lista de correo
        Client client = new Client (); //instanacia al cliente

        ml.attach (client); //agrega al cliente a la lista de suscriptores
        Dispatcher.dispatch (ml); //inicia la entrega de correos
    }
}

/**
 * Observer concrete class
 */
class Client implements Suscriber {

    /**
     * Método definido por la interfaz que sirve de conexión entre el objeto observado
     * y el suscriptor (esta clase)
     *
     * @param mail información recibida (update)
     */
    public void update (Mail mail) {
        String foo = String.format ("Sender: %s\n Subject: %s\n Body: %s\n\n", mail.sender, mail.subject, mail.body);
        System.out.println (foo);
    }
}