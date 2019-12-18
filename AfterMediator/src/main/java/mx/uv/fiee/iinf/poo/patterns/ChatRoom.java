package mx.uv.fiee.iinf.poo.patterns;

/**
 * Interface Mediator
 *
 * Define las acciones que deben ser implementadas por que desea servir como Mediator
 */
public interface ChatRoom {
    void sendMessage (String msg, String userId);
    void addUser (User user);
}
