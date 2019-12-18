package mx.uv.fiee.iinf.poo.patterns;

/**
 * Concrete Collegue
 *
 * Hereda los atributos específicos de la clase abstracta User y a su vez define la lógica
 * correspondiente a los métodos abstractos
 */
public class ConcreteUser extends User {

    public ConcreteUser (ChatRoom room, String id, String name) {
        super (room, id, name);
    }

    @Override
    public void send (String msg, String userId) {
        System.out.println (this.getName () + " :: Sending Message : " + msg);
        //delega el envío del mensaje al mediador, ya que ahì se mantiene la relación de usuarios
        getMediator ().sendMessage (msg, userId);
    }

    @Override
    public void receive (String msg) {
        System.out.println (this.getName () + " :: Received Message : " + msg);
    }
}
