package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarFakeDBDao;
import web.model.Car;

import java.util.List;
@Component
public class CarFakeDBService implements CarService{
    private CarDao dao = new CarFakeDBDao();

    @Autowired
    public void setDao(CarDao dao) {
        this.dao = dao;
    }

    public CarFakeDBService() {
    }

    @Override
    public List<Car> getFirstNCars(int n) {
        return dao.getFirstNCars(n);
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getAllCars();
    }
}
