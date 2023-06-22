package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar(@RequestParam("carNum") int carNum,
                          Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", 2.0));
        cars.add(new Car("Mersedes", "E-class", 2.0));
        cars.add(new Car("Toyota", "Corolla", 1.8));
        cars.add(new Car("Renault", "Daster", 1.6));
        cars.add(new Car("Audi", "A6", 2.0));

        switch (carNum) {
            case 0:
                cars.remove(4);
                cars.remove(3);
                cars.remove(2);
                cars.remove(1);
                cars.remove(0);
                break;
            case 1:
                cars.remove(4);
                cars.remove(3);
                cars.remove(2);
                cars.remove(1);
                break;
            case 2:
                cars.remove(4);
                cars.remove(3);
                cars.remove(2);
                break;
            case 3:
                cars.remove(4);
                cars.remove(3);
                break;
            case 4:
                cars.remove(4);
                break;
            default:
                break;
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
