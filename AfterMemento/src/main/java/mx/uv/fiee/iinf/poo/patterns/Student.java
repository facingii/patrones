package mx.uv.fiee.iinf.poo.patterns;

/**
 * Originator class
 */
public class Student implements IOriginator {
    public String id; //Student ID
    public String fullname; //Student name
    public String phone; //Student phone

    /**
     * Almacena el estado de los campos del objeto al crear una instantanea con dicha información
     * @return tipo IMemento que será almacenado en el histórico
     */
    public IMemento save () {
        return new Snapshot (id, fullname, phone);
    }
}
