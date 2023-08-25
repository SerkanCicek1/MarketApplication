package Business.abstracts;

import entities.concretes.Dish;

public abstract class DishService {

    public abstract void fillDishList();

    public abstract Dish findDishByCode(int code);

    public abstract void showMenu();
}