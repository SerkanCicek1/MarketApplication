package application.console.cafe.restaurant;

import Business.abstracts.DishService;
import entities.concretes.Dish;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDishService extends DishService {

    public List<Dish> dishList=new ArrayList<>();

    @Override
    public void fillDishList() {

        Dish dish1=new Dish(100,"Adana Kebabi",220.0);
        Dish dish2=new Dish(101,"Urfa Kebabı",200.0);
        Dish dish3=new Dish(102,"Çökertme Kebabı",200.0);
        Dish dish4=new Dish(200,"Baklava",100.0);
        Dish dish5=new Dish(201,"Kadayıf",85.0);
        Dish dish6=new Dish(202,"Künefe",75.0);
        Dish dish7=new Dish(300,"Yayık Ayranı",30.0);
        Dish dish8=new Dish(301,"Kola",35.0);
        Dish dish9=new Dish(302,"Çay",15.0);
        Dish dish10=new Dish(303,"Su",7.5);
        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);
        dishList.add(dish6);
        dishList.add(dish7);
        dishList.add(dish8);
        dishList.add(dish9);
        dishList.add(dish10);
    }

    @Override
    public Dish findDishByCode(int code) {
        if(code==0){
            System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
        }else{
            for(Dish a:this.dishList){
                if(a.getCode()==code){
                    return a;
                }
            }
            System.out.println("Urun Bulunamadi. ");
        }
        return new Dish(0,"",0);
    }

    @Override
    public void showMenu() {
        System.out.println("                  Lezzetlerimiz                  ");
        System.out.printf("%-3s    %-20s   %-5s \n", "Kod", "Adi", "Fiyat");
        System.out.printf("%-3s    %-20s   %-5s \n", "---", "---", "-----");
        for(Dish w:this.dishList){
            System.out.printf("%-3s    %-20s   %-5s TL \n", w.getCode(),w.getName(),w.getPrice());
        }
    }
}