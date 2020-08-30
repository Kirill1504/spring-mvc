package web.model;

public class Car {

    private String carName;
    private String carColor;
    private int carHp;

    public Car(String carName, String carColor, int carHp) {
        this.carName = carName;
        this.carColor = carColor;
        this.carHp = carHp;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarHp() {
        return carHp;
    }

    public void setCarHp(int carHp) {
        this.carHp = carHp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carHp=" + carHp +
                '}';
    }
}
