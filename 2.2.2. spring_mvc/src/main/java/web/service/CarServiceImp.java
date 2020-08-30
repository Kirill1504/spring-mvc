package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getCarsList() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("opel astra", "red", 140));
        carsList.add(new Car("BMW X5", "white", 249));
        carsList.add(new Car("Subaru XV", "green", 150));

        return carsList;
    }
}
