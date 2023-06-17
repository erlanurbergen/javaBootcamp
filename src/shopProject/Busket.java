package shopProject;

import java.util.ArrayList;

public class Busket {
    private Buyer buyer;
    private Salesman salesman;

    public Busket() {
    }

    public Busket(Buyer buyer, Salesman salesman) {
        this.buyer = buyer;
        this.salesman = salesman;
    }

    public void buyerBuyLaptop(int index) {
        if (index <=  Salesman.getLaptops().size()) {
            ArrayList<Laptop> laptops = Salesman.getLaptops();
            Laptop laptop = laptops.get(index);
            if (buyer.getMoneyCount() > laptop.getCost()) {
                System.out.println("Покупка прошла успешно");
                buyer.setMoneyCount(buyer.getMoneyCount()- laptop.getCost());
                try {
                    Salesman.deleteLaptop(index);
                } catch (Exception e) {
                    System.err.println("Данного товара нету в базе");
                }
                salesman.setBankAccount(salesman.getBankAccount() + (long)laptop.getCost());
            }
        } else {
            System.out.println("Товаров больше нету");
        }

    }
}
