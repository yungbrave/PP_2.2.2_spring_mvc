package web.service;

import web.Car;
import web.dao.CarDao;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> getCarsByNum(int carNum) {
        CarDao carDao = new CarDao();
        return carDao.getCars().stream().limit(carNum).collect(Collectors.toList());
    }
}
