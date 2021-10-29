package NullObject;

//Clase concreta, ampliación de AbstractStudent
public class NullStudent extends AbstractStudent {


    @Override
    public String getName() {
        return "Not available in Student Database";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
