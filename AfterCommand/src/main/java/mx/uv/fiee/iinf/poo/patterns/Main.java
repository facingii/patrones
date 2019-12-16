package mx.uv.fiee.iinf.poo.patterns;

public class Main {

    public static void main (String [] args) {
        // se instancia un objeto command y pasamos como parámetro el receiver correspondiente
        Command command = new OpenFileCommand ();
        // se crea al objeto intermediario (invoker) pasando como parámetro el commando deseado
        FileActionInvoker invoker = new FileActionInvoker (command);
        invoker.execute (); //ejecutamos el comando

        command = new WriteFileCommand ();
        invoker = new FileActionInvoker (command);
        invoker.execute ();

        command = new CloseFileCommand ();
        invoker = new FileActionInvoker (command);
        invoker.execute ();
    }

}
