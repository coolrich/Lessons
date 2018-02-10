package lesson9.atHome.ex1;

import lesson9.atHome.ex1.Apple;
import lesson9.atHome.ex1.Apricot;
import lesson9.atHome.ex1.Fruit;
import lesson9.atHome.ex1.Pear;

/**
 * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. Класс Фрукт содержит:
 * a) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
 * Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

public class FruitShop {
    public static void main(String[] args) {
        Fruit[] fruits = {new Apple(100, "Green", "Glory to winners", 1), new Pear(90, "Yellow", "Best", 2), new Apricot(15, "Bullet", 3)};
        System.out.println("The total cost of all fruits is " + Fruit.getCostOfAllFrts());
        for (Fruit f : fruits) {
            System.out.println("The total cost of " + f.getFrstName() + " is " + f.getCostOfFrts());
        }
    }
}
