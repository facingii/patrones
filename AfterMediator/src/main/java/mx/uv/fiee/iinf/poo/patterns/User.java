package mx.uv.fiee.iinf.poo.patterns;

/**
 * Collegue
 */
public abstract class User {

    private ChatRoom mediator;
    private String id;
    private String name;

    public User (ChatRoom room, String id, String name) {
        this.mediator = room;
        this.id = id;
        this.name = name;
    }

    public abstract void send (String msg, String userId);
    public abstract void receive (String msg);

    public ChatRoom getMediator () {
        return this.mediator;
    }

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }
}
