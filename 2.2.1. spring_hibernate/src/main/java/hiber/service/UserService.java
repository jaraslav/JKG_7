package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User model);
    List<User> listUsers();

    List<Car> listCars();

    List<User> getUserOwner(String volvo, int i);

}
