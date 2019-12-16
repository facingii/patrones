package mx.uv.fiee.iinf.poo.patterns;

/**
 * Receiver class
 *
 * Entidad que encapsula las acciones que desean ser ejecutados
 */
public class FileSystemReceiver {

    public void openFile () {
        System.out.println ("Opening file...");
    }

    public void writeFile () {
        System.out.println ("Writing file...");
    }

    public void closeFile () {
        System.out.println ("Closing file...");
    }

}
