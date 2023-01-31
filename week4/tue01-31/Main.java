import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);



        Car car1 = new Car("Model 3");
        Car car2 = new Car("Civic");

        car2 = car1; // changed from car1 = car2

        car2.setModel("Ioniq5");

        System.out.println("Car1: " + car1);
        System.out.println("Car2: " + car2);
        // original version output was
        // ioniq5, ioniq5

    }
}
