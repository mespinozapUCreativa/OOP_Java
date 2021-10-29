package NullObject;

//Aquí devuelve según el dato del estudiante que se le pasa desde los objetos: "Real Student" o "NullStudent"

public class StudentFactory {

    public static final String[] names = {"Estudiante1", "Estudiante2", "Estudiante3"};

    public static AbstractStudent getStudent(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealStudent(name);
            }
        }
        return new NullStudent();
    }
}
