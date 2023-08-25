package application.console.cafe;

import java.util.Scanner;

public class CafeBillGenerator {

    public void getSelectionMenu(CafeDishService cafeDishService,CafeOrderService cafeOrderService){
        cafeDishService.fillDishList();
        int select = -1;
        while (select != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("=========    Ana Cafe Siparis Uygulamasi ===========");
            System.out.println("1-Menu");
            System.out.println("2-Siparis girme");
            System.out.println("3-Siparis iptal etme");
            System.out.println("4-Hesap Olustur");
            System.out.println("0-CIKIS");
            System.out.println("Seciminiz : ");
            select = sc.nextInt();
            System.out.println("------------------------------------------------------------------------");

            switch (select) {
                case 1:
                    cafeDishService.showMenu();
                    break;
                case 2:
                    cafeOrderService.crateOrder(cafeDishService);
                    break;
                case 3:
                    cafeOrderService.deleteOrder();
                    break;
                case 4:
                    cafeOrderService.printBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;
            }
        }

    }

}