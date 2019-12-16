package mx.uv.fiee.iinf.poo.patterns;

/**
 * Objeto que representa el commando OpenFile. Internamente invoca a la acción correspondiente
 * en el objeto receiver
 */
public class OpenFileCommand implements Command {
    //campo que mantiene referencia al objeto receiver
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand () {
        this.fileSystemReceiver = new FileSystemReceiver ();
    }

    /**
     * Ejecuta la acción (método) correspondiente en el objeto receiver
     */
    @Override
    public void execute () {
        this.fileSystemReceiver.openFile ();
    }
}
