package web.service;

import web.dao.CarDao;
import web.dao.CarFakeDBDao;
import web.model.Car;

import java.util.List;

public class CarFakeDBService implements CarService{
    @Override
    public List<Car> getFirstNCars(int n) {
        return dao.getFirstNCars(n);
    }

    CarDao dao = new CarFakeDBDao();
    @Override
    public List<Car> getAllCars() {
        return dao.getAllCars();
    }
}
