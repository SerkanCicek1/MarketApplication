package entities.concretes;

public class Order {

    public int orderCode;
    public Dish dish;
    public int numOfDish;
    public double orderPrice;

    public Order(Dish dish, int numOfDish) {
        this.dish = dish;
        this.numOfDish = numOfDish;
        setPrice();
        orderCode++;
    }

    public void setOrderCode(int orderCode) { //setter methot
        this.orderCode = orderCode;
    }

    public void setPrice() { //yeni bir methot (setter degil)
        this.orderPrice = this.dish.getPrice() * numOfDish; // 3 x Adana (3*220)
    }
}
