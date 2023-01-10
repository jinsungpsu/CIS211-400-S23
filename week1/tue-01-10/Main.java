import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create a class to store it in
        // goal is to display all the pc info from data.csv

        // a class defines an object in java
        // data elements / variables / data types
        // different methods in it

        // mimics a real life object
        // interpret something in real life

        Component cpu = new Component("13700k", 450);
        // cpu.name = "13700k";
        // cpu.price = 450;

        Component gpu = new Component();
        gpu.setName("RTX4090");
        gpu.setPrice(1499);

        ArrayList<Component> partslist = new ArrayList<>();
        partslist.add(cpu);
        partslist.add(gpu);

        for (int i = 0; i < partslist.size(); i++) {
            System.out.println(partslist.get(i));
        }




    }
}
