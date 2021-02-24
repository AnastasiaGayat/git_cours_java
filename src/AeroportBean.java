public class AeroportBean {
    private AvionBean[] places = new AvionBean[10];

    public void garer(AvionBean a) {
        for (int i = 0; i < places.length; i++) {
            // Trouver la premiere place libre
        }
        a.setSpeed(0);
    }

    public void decoler(int position) {

        if (position != 0) {

            places[position].boost();
            places[position] = null;
        }
    }

}
