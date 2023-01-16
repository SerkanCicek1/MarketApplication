package entities;
/*
    No   Product    Price
         ===== ======= ========
    00 Tomato 2.10 TL ,
    01 Potato 3.20 TL ,
    02 Pepper 1.50 TL ,
    03 Onion 2.30 TL  ,
    04 Carrot 3.10 TL
    05 Apple 1.20 TL
    06 Banana 1.90 TL
    07 Strawberry 6.10 TL
    08 Melon 4.30 TL
    09 Grape 2.70 TL
    10 Lemon 0.50 TL
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class GreenGrocer {
    // int productId;
//    String product;
    double price;
    double lastPrice;
    double unitIsStock;
    //Date arrivalDate; // arrival date - urun gelis tarihi
    Date mfgDate; // manufacturing date - imalat tarihi
    Date expDate; // expire date - son kullanma tarihi --> long
    List<String> products = new ArrayList<>();
    public GreenGrocer(double price, double lastPrice, double unitIsStock, Date mfgDate, Date expDate, List<String> products) {
        this.price = price;
        this.lastPrice = lastPrice;
        this.unitIsStock = unitIsStock;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.products = products;

    }
}
