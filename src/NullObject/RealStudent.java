package NullObject;

//Clase concreta, ampliación de AbstractStudent
public class RealStudent extends AbstractStudent {

    public RealStudent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
