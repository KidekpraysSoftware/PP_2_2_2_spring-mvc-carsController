package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer сount) {

        //Cars DataBase
        List<Car> cars_DB = new ArrayList<>();
        cars_DB.add(new Car("Black", "Honda", 111));
        cars_DB.add(new Car("White", "Lada", 222));
        cars_DB.add(new Car("Red", "Toyota", 333));
        cars_DB.add(new Car("Red", "Kia", 444));
        cars_DB.add(new Car("Black", "Audi", 555));

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i<5 && i < сount; i++) {
            cars.add(cars_DB.get(i));
        }

        return cars;
    }
}
