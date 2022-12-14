package web.model;
import java.util.ArrayList;
import java.util.List;

public class CarHolder {

    private static List<Car> cars = new ArrayList<>();

    public static List<Car> getCars() {
        return cars;
    }
    static {
        for (int i = 1; i < 10; i+=2) {
            Car car = new Car();
            car.setModel("BMW X" + i);
            car.setVersion("i38" + i);
            car.setOwner("Bayerische Motoren Werke AG");
            cars.add(car);
        }
    }
}
