package mx.uv.fiee.iinf.poo.patterns;

/**
 * State concrete class
 *
 * Representa el estado Playing (en ejecución)
 *
 * Reimplementa el método definido en la intefaz con código concreto al estado
 */
public class PlayingState implements State {
    @Override
    public void performAction (MP3Player context) {
        context.isPlaying = true;
        System.out.println ("Now playing... " + context.filename );
    }
}
