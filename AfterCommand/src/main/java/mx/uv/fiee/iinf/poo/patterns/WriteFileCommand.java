package mx.uv.fiee.iinf.poo.patterns;

/**
 * Objeto que representa el commando WriteFile. Internamente invoca a la acción correspondiente
 * en el objeto receiver
 */
public class WriteFileCommand implements Command {
    //campo que mantiene referencia al objeto receiver
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand () {
        this.fileSystemReceiver = new FileSystemReceiver ();
    }

    /**
     * Ejecuta la acción (método) correspondiente en el objeto receiver
     */
    @Override
    public void execute () {
        this.fileSystemReceiver.writeFile ();
    }
}
