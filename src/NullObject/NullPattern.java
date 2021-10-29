package NullObject;

//utiliza "StudentFactory", para mostrar el NullObject

public class NullPattern {
    public static void main(String[] args) {

        AbstractStudent student1 = StudentFactory.getStudent("Estudiante1");
        AbstractStudent student2 = StudentFactory.getStudent("Estudiante2");
        AbstractStudent student3 = StudentFactory.getStudent("Estudiante7");

        System.out.println("Students");
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());

    }
}
