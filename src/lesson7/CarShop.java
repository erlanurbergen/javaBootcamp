package lesson7;

public class CarShop {
    String name;
    Car cars[] = new Car[50];
    int index = 0;

    public CarShop(String name) {
        this.name = name;
    }

    void addCar(Car car) {
        cars[index] = car;
        index++;
    }

    void deleteCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                cars[i] = null;
                System.out.println("Машина удалена");
                break;
            } else {
                System.out.println("Машины нету");
                break;
            }
        }
    }

    void printAllCars() {
        for (int i = 0; i < index; i++) {
            if (cars[i] == null)
                continue;
            else
                System.out.println(cars[i]);
        }

//        for (int i = 0; i < index; i++) {
//            System.out.println(cars[i]);
//        }
    }

    int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += cars[i].cost;
        }

        return sum;
    }


}
