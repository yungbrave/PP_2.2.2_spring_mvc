package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Car;
import web.dao.CarDao;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCarsByNum(int carNum) {
        return carDao.getCars().stream().limit(carNum).collect(Collectors.toList());
    }
}
