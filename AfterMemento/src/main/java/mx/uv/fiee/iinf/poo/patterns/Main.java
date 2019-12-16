package mx.uv.fiee.iinf.poo.patterns;

public class Main {

    public static void main (String [] args) {
        Caretaker caretaker = new Caretaker (); // instanciamos al objeto que mantendrá el histórico de mementos

        // crea un objeto student y se inicializan sus campos (estado)
        Student student = new Student ();
        student.fullname = "John Wick";
        student.id = "1";
        student.phone = "343435545";

        caretaker.add (student.save ()); // genera la instantánea del objeto usando el método save

        // modificamos el contenido de los campos
        student.fullname = "John Snow";
        student.id = "2";
        student.phone = "546546567";

        // imprime el estado de las variables
        String foo = String.format ("ID: %s\n Name: %s\n Phone: %s\n\n", student.id, student.fullname, student.phone);
        System.out.println (foo);

        // restauramos el estado del objeto mediante una llamada al método restore de la instantanea
        student = (Student) caretaker.get ().restore ();
        // y se imprimen los valores nuevamente
        foo = String.format ("ID: %s\n Name: %s\n Phone: %s\n\n", student.id, student.fullname, student.phone);
        System.out.println (foo);
    }

}
