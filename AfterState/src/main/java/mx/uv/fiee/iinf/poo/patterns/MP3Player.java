package mx.uv.fiee.iinf.poo.patterns;

/**
 * Clase context
 *
 * Almacena las variables necesarias para funcionar, pero no ejecuta las acciones directamente
 * en vez de eso, delegar esa responsabilidad en los objetos concretos de los estados
 */
public class MP3Player  {
    private State state; //campo privado que mantiene referencia hacia alguno de los estados posibles
    public String filename; //audio file
    public boolean isPlaying; //flag

    public MP3Player (String filename) {
        this.filename = filename;
    }

    public void setFilename (String newFile) {
        this.filename = newFile;
    }

    public void setState (State state) {
        this.state = state;
    }

    public State getState () {
        return  this.state;
    }

    public void execute () {
        state.performAction (this);
    }
}
