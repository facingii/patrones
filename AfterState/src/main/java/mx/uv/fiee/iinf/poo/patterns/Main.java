package mx.uv.fiee.iinf.poo.patterns;

public class Main {

    public static void main (String [] args) {
        MP3Player player = new MP3Player ("AlanisMorissette_Ironic.mp3");
        player.setState (new PlayingState ());
        player.execute ();

        player.setState (new PauseState ());
        player.execute ();

        player.setFilename ("AlanisMorissette_Reason.mp3");
        player.setState (new PlayingState ());
        player.execute ();

        player.setState (new PauseState ());
        player.execute ();
    }

}
