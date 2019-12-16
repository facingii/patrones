package mx.uv.fiee.iinf.poo.patterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Mediator
 */
public class ConcreteChatRoom implements ChatRoom {

    private Map<String, User> users = new HashMap<>();

    @Override
    public void sendMessage (String msg, String userId) {
        User u = users.get (userId);
        u.receive (msg);
    }

    @Override
    public void addUser (User user) {
        this.users.put (user.getId (), user);
    }
}
