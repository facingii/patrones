package mx.uv.fiee.iinf.poo.patterns;

/**
 * Clase Collegue
 *
 * Clase abstracta que define la plantilla con que se estructurará a cada tipo User
 */
public abstract class User {
    private ChatRoom mediator; //referencia al objeto Mediator
    private String id; //id del usuario
    private String name; //nombre del usuario

    /**
     * Inicializa el objeto User con los parámetros correspondientes
     * @param room Objeto Mediator
     * @param id ID del usuario
     * @param name Nombre del Usuario
     */
    public User (ChatRoom room, String id, String name) {
        this.mediator = room;
        this.id = id;
        this.name = name;
    }

    /**
     * Método abstracto que representa la acción de envío
     * @param msg texto a envíar
     * @param userId ID del usuario destino
     */
    public abstract void send (String msg, String userId);

    /**
     * Método abstracto que representa la acción de recepción de mensajes
     * @param msg Mensaje recibido
     */
    public abstract void receive (String msg);

    /** Getters **/
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
