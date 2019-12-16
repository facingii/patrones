package mx.uv.fiee.iinf.poo.patterns;

/**
 * Objeto que representa el commando CloseFile. Internamente invoca a la acción correspondiente
 * en el objeto receiver
 */
public class CloseFileCommand implements Command {
    //campo que mantiene referencia al objeto receiver
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand () {
        this.fileSystemReceiver = new FileSystemReceiver ();
    }

    /**
     * Ejecuta la acción (método) correspondiente en el objeto receiver
     */
    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile ();
    }
}
