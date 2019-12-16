package mx.uv.fiee.iinf.poo.patterns;

/**
 * State concrete class
 *
 * Representa el estado Pause (Pausa)
 *
 * Reimplementa el método definido en la intefaz con código concreto al estado
 */
public class PauseState implements State {
    @Override
    public void performAction (MP3Player context) {
        if (context.isPlaying) {
            System.out.println ("Pausing...");
        }
    }
}
