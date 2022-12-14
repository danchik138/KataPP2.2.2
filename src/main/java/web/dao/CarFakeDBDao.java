package web.dao;

import org.springframework.stereotype.Component;
import web.fakeDB.CarDB;
import web.model.Car;

import java.util.List;
@Component
public class CarFakeDBDao implements CarDao{
    public CarFakeDBDao() {
    }

    @Override
    public List<Car> getFirstNCars(int n) {
        List<Car> cars = CarDB.getCars();
        if (n < cars.size()) {
            return cars.subList(0, n);
        }
        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return CarDB.getCars();
    }
}
