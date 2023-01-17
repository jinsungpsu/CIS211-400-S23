import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr2.add(i);
        }

        for (int i = 0; i < arr2.size(); i++) {
            if (arr2.get(i) == 4) {
                System.out.println(true);
            }
        }*/

        ArrayList<Cat> litter = new ArrayList<>();
        litter.add(new Cat("Garfield", 5));
        litter.add(new Cat("Sphinx", 999));
        litter.add(new Cat("Tom", 10));
        Cat cat = new Cat("Hello Kitty", 7);
        litter.add(cat);

        //System.out.println(litter);

        Scanner key = new Scanner(System.in);
        int rouhidIsAwesome = key.nextInt();

        for (int i = 0; i < litter.size(); i++) {
            Cat tempCat = litter.get(i);
            if (tempCat.getAge() == rouhidIsAwesome) {
                System.out.println(tempCat.getName());
            }
        }
    }
}