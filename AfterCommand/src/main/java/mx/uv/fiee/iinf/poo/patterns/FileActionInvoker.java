package mx.uv.fiee.iinf.poo.patterns;

/**
 * Clase intermedia por medio de la cual los clientes ejecutarán los comandos deseados.
 * Los clientes no debe poder ejecutar los comando o acciones directamente.
 */
public class FileActionInvoker {
    // mantiene referencia al comando que será ejecutado
    public Command command;

    public FileActionInvoker (Command c) {
        this.command = c;
    }

    public void execute () {
        this.command.execute ();
    }
}
