package deExo;

public class GobeletBean {
    private DeBean d1;
    private DeBean d2;

    public GobeletBean() {
        this(false);
        //d1 = new DeBean();
        // d2 = new DeBean();
    }

    public GobeletBean(boolean truque) {
        if (truque) {
            d1 = new DePipeeBean();
            d2 = new DeBean();
        } else {
            d1 = new DeBean();
            d2 = new DeBean();
        }

    }


    public void lancer() {
        d1.lancer();
        d2.lancer();
    }

    public int getScoreDes() {
        //  System.out.println("de1 " + d1.getValue());
        // System.out.println("de2 " + d2.getValue());
        return d1.getValue() + d2.getValue();
    }

    public DeBean getD1() {
        return d1;
    }

    public DeBean getD2() {
        return d2;
    }
}

