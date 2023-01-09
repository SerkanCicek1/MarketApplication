package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Case {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        basket();

    }//main
    public static void basket(){
        Scanner scan = new Scanner(System.in);
        String select = null;
        double kg;
        int idx = 0;
        double price;
        double totalPrice = 0;
        double productTotalPrice = 0;
        String isQuit = null;
        System.out.println("Welcome to the Market");
        List<String> ggProducts = new ArrayList<>(Case.grgProducts());
        List<Double> ggPrices = new ArrayList<>(Case.prices());
        do {
            System.out.println("Lütfen listeden eklemek istediginiz ürünü seçiniz");
            for (int i = 0; i < ggProducts.size(); i++) {
                System.out.print(ggProducts.get(i)+": "+ggPrices.get(i)+" TL , ");
            }
            System.out.println();
            select = scan.next().toLowerCase().replaceAll("[^a-zA-z]", "").trim();
            for (int i = 0; i < ggProducts.size(); i++) {
                if (select.equals(ggProducts.get(i))){
                    idx = i;
                    break;
                }
            }
            System.out.println("Kaç kg ürün alacağınızı giriniz");
            kg = scan.nextDouble();
            price = ggPrices.get(idx);
            totalPrice += price * kg;
            productTotalPrice = price*kg;
            System.out.printf("%.2f",productTotalPrice);
            System.out.print(" TL\n");
            System.out.printf("Sepet toplamı:"+"%.2f", totalPrice);
            System.out.println(" TL" +"\nAlışverişi bitirmek için 'Q' , devam etmek için herhangi bir tuşa basınız.");
            isQuit =scan.next();
            if (isQuit.equalsIgnoreCase("Q")){
                break;
            }
        }while (true);
        System.out.printf("Ödemeniz Gereken Tutar: "+"%.2f", totalPrice);
        System.out.println();
        System.out.println("Bizi tercih ettiğiniz için teşekkürler, tekrar bekleriz...");
    }
    public static List<String> grgProducts(){
        List<String> grgProducts = new ArrayList<>();
        grgProducts.add("tomato");
        grgProducts.add("potato");
        grgProducts.add("pepper");
        grgProducts.add("onion");
        grgProducts.add("carrot");
        grgProducts.add("apple");
        grgProducts.add("banana");
        grgProducts.add("strawberry");
        grgProducts.add("melon");
        grgProducts.add("grape");
        grgProducts.add("lemon");
        return grgProducts;
    }

    public static List<Double> prices(){
        List<Double> grgPrices = new ArrayList<>();
        grgPrices.add(2.10);
        grgPrices.add(3.20);
        grgPrices.add(1.50);
        grgPrices.add(2.30);
        grgPrices.add(3.10);
        grgPrices.add(1.20);
        grgPrices.add(1.90);
        grgPrices.add(6.10);
        grgPrices.add(4.30);
        grgPrices.add(2.70);
        grgPrices.add(0.50);
        return grgPrices;
    }
}//class
