package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar(@RequestParam("carNum") int carNum,
                          Model model) {
        CarService carService = new CarService();
        List<Car> cars = carService.getCarsByNum(carNum);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
