package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarsController {
    private final CarServiceImp carServiceImp = new CarServiceImp();

    @GetMapping("/cars")
    public String printCars(@RequestParam ("locale") String locale,  Model model) {
        List<Car> listCars = carServiceImp.getCarsList();

        if (locale.equals("ru")) {
            model.addAttribute("title", "МАШИНЫ");
        } else if (locale.equals("en")) {
            model.addAttribute("title", "CARS");
        }
        model.addAttribute("cars", listCars);
        return "cars";
    }
}
