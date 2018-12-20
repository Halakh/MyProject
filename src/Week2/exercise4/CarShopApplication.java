package Week2.exercise4;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car car1 = new Car("BMW");
        Car car2 = new Car ("Ferrari");
        Car car3 = new Car ("Mercedes");
        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);

    }
}
