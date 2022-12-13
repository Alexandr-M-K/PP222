package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private static long CAR_COUNT;
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_COUNT,"Model rR",156));
        carList.add(new Car(++CAR_COUNT,"Model tT",516));
        carList.add(new Car(++CAR_COUNT,"Model yY",163));
        carList.add(new Car(++CAR_COUNT,"Model uU",987));
        carList.add(new Car(++CAR_COUNT,"Model fF",123));
    }

    @Override
    public List<Car> listCars() {
        return carList;
    }
}
