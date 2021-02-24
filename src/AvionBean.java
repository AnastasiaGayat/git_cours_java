public class AvionBean {
    private double speed;
    private String color;

    public void boost() {
        speed += 200;
    }

    public void stop() {
        speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
