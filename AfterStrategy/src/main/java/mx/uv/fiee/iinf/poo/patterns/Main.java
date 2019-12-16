package mx.uv.fiee.iinf.poo.patterns;

/**
 * client
 */
public class Main {

    public static void main (String [] args) {
        //instanciamos al objeto Invoker
        SocialContext context = new SocialContext ();

        //seleccionamos una estrategia y la asignamos al contexto
        context.setStrategy (new FacebookStrategy ());
        context.connect ("Charlize");// invocamos a la acción definida en la estrategia

        System.out.println ("----------------------------");

        //cambiamos de estrategia para conectar a otra cuenta
        context.setStrategy (new TwitterStrategy ());
        context.connect ("Fu Manchú");

        System.out.println ("----------------------------");

        context.setStrategy (new InstagramStrategy ());
        context.connect ("Jennifer Selter");
    }

}
