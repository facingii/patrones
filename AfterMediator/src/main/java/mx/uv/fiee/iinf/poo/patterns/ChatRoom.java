package mx.uv.fiee.iinf.poo.patterns;

/**
 * Mediator
 */
public interface ChatRoom {

    void sendMessage (String msg, String userId);
    void addUser (User user);

}
