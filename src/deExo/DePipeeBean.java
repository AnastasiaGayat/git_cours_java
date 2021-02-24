package deExo;

import java.util.Random;

public class DePipeeBean extends DeBean {
    @Override
    public void lancer() {
        //1chance sur 2 -> 6
        //if (new Random().nextInt(2)==0)

        if (new Random().nextBoolean()) {
            setValue(6);
            System.out.println("Truquage");
        }
        //1 chance sur 2 ->  lancer normal
        else {
            super.lancer();
        }


    }
}
