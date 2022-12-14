package web.fakeDB;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDB {

    private static List<Car> cars = new ArrayList<>();

    public static List<Car> getCars() {
        return List.copyOf(cars);
    }
    static {
        for (int i = 1; i < 30; i+=2) {
            Car car = new Car();
            car.setModel("BMW X" + i);
            car.setVersion("i38" + i);
            car.setOwner("Bayerische Motoren Werke AG");
            cars.add(car);
        }
    }
}
