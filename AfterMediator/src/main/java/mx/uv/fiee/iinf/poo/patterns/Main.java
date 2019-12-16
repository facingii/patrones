package mx.uv.fiee.iinf.poo.patterns;

/**
 * Clase cliente
 */
public class Main {

    public static void main (String [] args) {

        //Mediator
        ChatRoom chatRoom = new ConcreteChatRoom ();

        //Collegues
        User user1 = new ConcreteUser(chatRoom, "1", "Dany");
        User user2 = new ConcreteUser(chatRoom, "2", "John");
        User user3 = new ConcreteUser(chatRoom, "3", "Tyrion");
        User user4 = new ConcreteUser(chatRoom, "4", "Sansa");
        User user5 = new ConcreteUser(chatRoom, "5", "Arya");

        chatRoom.addUser (user1);
        chatRoom.addUser (user2);
        chatRoom.addUser (user4);

        user1.send ("Hello, there!", "4");
        user2.send ("Hey! whats up!", "1");
    }

}
