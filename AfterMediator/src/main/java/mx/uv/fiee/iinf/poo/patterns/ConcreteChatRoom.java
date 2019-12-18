package mx.uv.fiee.iinf.poo.patterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Mediator
 *
 * Implementa la interfáz Mediator y define cada uno de los métodos con lógica propio
 */
public class ConcreteChatRoom implements ChatRoom {
    //colección de usuarios
    private Map<String, User> users = new HashMap<>();

    /**
     * Envío el mensaje al usuario indicado por el ID
     * @param msg texto a enviar
     * @param userId identificación del usuario destino
     */
    @Override
    public void sendMessage (String msg, String userId) {
        User u = users.get (userId);
        u.receive (msg);
    }

    /**
     * Añade un nuevo usuario a la colección
     * @param user nuevo usuario
     */
    @Override
    public void addUser (User user) {
        this.users.put (user.getId (), user);
    }
}
