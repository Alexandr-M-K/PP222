package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> listCars() {
        return carDao.listCars();
    }
    public List<Car> listCars(int count) {
        return carDao.listCars().stream().limit(count).toList();
    }

}
