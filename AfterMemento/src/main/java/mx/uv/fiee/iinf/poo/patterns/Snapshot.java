package mx.uv.fiee.iinf.poo.patterns;

/**
 * Subject class
 */
public class Snapshot implements IMemento {
    private String id;
    private String fullname;
    private String phone;

    /**
     * crea la instantanea a partir del valor de los campos del objeto originator
     * se almacenan tipos básicos en lugar de tipos referencias complejos
     * @param id
     * @param name
     * @param phone
     */
    public Snapshot (String id, String name, String phone) {
        this.id  = id;
        this.fullname = name;
        this.phone = phone;
    }

    /**
     * restaura el objeto originator utilizando los valores almacenados
     * @return objeto restaurado
     */
    public IOriginator restore () {
        Student student = new Student ();
        student.id = this.id;
        student.fullname = this.fullname;
        student.phone = this.phone;

        return student;
    }
}
