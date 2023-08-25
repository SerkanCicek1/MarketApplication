package Business.abstracts;

import application.console.cafe.CafeDishService;
import application.console.cafe.restaurant.RestaurantDishService;
import application.console.restaurant.RestaurantDishService;
import entities.concretes.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class OrderService {

    Scanner scanner = new Scanner(System.in);
    protected List<Order> orderList = new ArrayList<>();


    public void createOrder(DishService dishService) {

//        int dishCode = -1;
//        while (dishCode != 0) {
//            System.out.println("Lutfen Urun Kodu Giriniz :  (CIKIS : 0)");   ///  Burda da Method Overloading oldu
//            dishCode = scanner.nextInt();
//            Dish dish = restaurantService.findDishByCode(dishCode);
//            if (dish.getCode() > 0) {
//                System.out.print("Adet Giriniz : ");
//                int num = scanner.nextInt();
//                Order order = new Order(dish, num);
//                order.setOrderCode(1000 + this.orderList.size());
//                this.orderList.add(order);
//            }
//            for (Order order : this.orderList) {
//                System.out.printf("Siparis Kodu :%-5s  Lezzet Kodu :%-3s     Adi :%-20s  Adet : %-3s \n",
//                        order.orderCode, order.dish.getCode(), order.dish.getName(), order.numOfDish);
//            }
//        }
    }

    public void deleteOrder() {
        boolean isValid = true;
        if (this.orderList.isEmpty()) {
            System.out.println("Siparisiniz Bulunmamaktadir..");
        } else {
            System.out.print("Iptal Etmek Istediginiz Siparisin kodunu giriniz : ");
            int code = scanner.nextInt();
            for (Order siparis : this.orderList) {
                if (siparis.orderCode == code) {
                    this.orderList.remove(siparis);
                    System.out.println("Siparisiniz Iptal Edildi " + siparis.orderCode + " " + siparis.dish.toString());
                    isValid = true;
                    break;
                } else {
                    isValid = false;

                }
            }

            if (!isValid) {
                System.out.println("Siparis Kodu Gecersiz");
            }
        }
    }

    public void printBill() {
        double totalPrice = 0.0;
        System.out.println("                   ====>       Lezzet Fisiniz        <====                 ");
        for (Order order : this.orderList) {
            System.out.printf("Lezzet kodu: %-5s   Adi : %-20s   Adeti : %-5s   Siparis tutari: %-5s TL\n",
                    order.dish.getCode(), order.dish.getName(), order.numOfDish, order.orderPrice);
            totalPrice += order.orderPrice;
        }
        System.out.println("Toplam Tutar : " + totalPrice);
        System.out.println("============   Afiyet Olsun  ============");
        this.orderList = new ArrayList<>();
    }

    public void createOrder(RestaurantDishService restaurantDishService) {

    }//createOrder override

    public void crateOrder(CafeDishService cafeDishService){

    }

    public abstract void createOrder(RestaurantDishService restaurantDishService)//createOrder override
    ;
}
