package web.dao;

import org.springframework.stereotype.Repository;
import web.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    List<Car> cars = new ArrayList<>();

    public CarDao() {
        cars.add(new Car("BMW", "M5", 2.0));
        cars.add(new Car("Mersedes", "E-class", 2.0));
        cars.add(new Car("Toyota", "Corolla", 1.8));
        cars.add(new Car("Renault", "Daster", 1.6));
        cars.add(new Car("Audi", "A6", 2.0));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarDao{" +
                "cars=" + cars +
                '}';
    }
}
