package application.console.cafe;

import Business.abstracts.DishService;
import entities.concretes.Dish;

import java.util.ArrayList;
import java.util.List;

public class CafeDishService extends DishService {

    List<Dish> cafeDishList = new ArrayList<>();

    @Override
    public void fillDishList() {
        Dish dish1 = new Dish(401, "Tiramisu", 35.0);
        Dish dish2 = new Dish(402, "Dondurma", 25.0);
        Dish dish3 = new Dish(403, "Profiterol", 25.0);
        Dish dish4 = new Dish(404, "Kahve", 17.5);
        Dish dish5 = new Dish(405, "Çay", 7.5);
        Dish dish6 = new Dish(406, "Portakal Suyu", 25.5);
        cafeDishList.add(dish1);
        cafeDishList.add(dish2);
        cafeDishList.add(dish3);
        cafeDishList.add(dish4);
        cafeDishList.add(dish5);
        cafeDishList.add(dish6);
    }

    @Override
    public void showMenu() {
        System.out.println("                 Kafe  Lezzetlerimiz                  ");
        System.out.printf("%-3s    %-20s   %-5s \n", "Kod", "Adi", "Fiyat");
        System.out.printf("%-3s    %-20s   %-5s \n", "---", "---", "-----");
        for (Dish a : this.cafeDishList) {
            System.out.printf("%-3s    %-20s   %-5s  Lira\n", a.getCode(), a.getName(), a.getPrice());
        }

    }

    @Override
    public Dish findDishByCode(int code) {
        if (code == 0) {
            System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
        } else {
            for (Dish a : this.cafeDishList) {
                if (a.getCode() == code) {
                    return a;
                }
            }
            System.out.println("Urun Bulunamadi. ");
        }
        return new Dish(0, "", 0);
    }

}