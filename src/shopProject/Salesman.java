package shopProject;

import java.util.ArrayList;

public class Salesman extends User{

    private BusinessType businessType;
    private long bankAccount;
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    private static ArrayList<Mobile> mobiles = new ArrayList<>();

    static {
        laptops.add(new Laptop("Lenovo pavilion", 200000));
        laptops.add(new Laptop("Macbook pro", 500000));
        laptops.add(new Laptop("Asus 2", 350000));

        mobiles.add(new Mobile("Iphone 14", 650000));
        mobiles.add(new Mobile("Iphone 12", 400000));
        mobiles.add(new Mobile("Xiomi redmi", 65000));
    }



    static ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    static ArrayList<Mobile> getMobiles() {
        return mobiles;
    }

    public static void deleteLaptop(int index){
        laptops.remove(index);
    }

    public static void deleteMobile(int index){
        mobiles.remove(index);
    }



    // Покупатель может покупать товары у продавца.
    // Вам надо продумать логику, если у продавца есть только 5 ноутбуков,
    // а покупатель хочет купить шестой, значит вы должны дать понять
    // что этого нельзя сделать. Может быть вам надо создать какое то поле,
    // которое равно размеру массива, и при каждой покупке это поле увеличивается.
    // Если это поле равно длине массива, значит что то происходит
    // Продавец видит отчет продаж

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }



    @Override
    void changeNumber(String number) {
        setPhoneNumber(number);
    }

    @Override
    void changeFIO(String data) {
        setFIO(data);
    }
}
