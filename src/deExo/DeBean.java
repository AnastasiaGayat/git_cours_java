package deExo;

import java.util.Random;

public class DeBean {

    private int value;


    public DeBean() {
        value = 1;
    }


    public void lancer() {
        value = new Random().nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
