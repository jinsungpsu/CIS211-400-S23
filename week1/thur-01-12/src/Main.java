import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a class to store it in
        // goal is to display all the pc info from data.csv

        // a class defines an object in java
        // data elements / variables / data types
        // different methods in it

        // mimics a real life object
        // interpret something in real life

        ArrayList<Component> partslist = new ArrayList<>();

        File componentInfoCSVfile = new File("week1review/classDemo.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(componentInfoCSVfile);
            while(fileScanner.hasNextLine()) {
                // System.out.println("Please enter a part name and price, separated by space");

                String componentInfoLine = fileScanner.nextLine();

                String[] componentInfoSplit = componentInfoLine.split(",");

                String partName = componentInfoSplit[0];
                double partPrice = Double.parseDouble(componentInfoSplit[1]);
                Component component = new Component(partName, partPrice);
                partslist.add(component);

                System.out.println(component.getName());
            }

        /*
        How do I create components based off of user input (fileScanner)
        rather than hard coded
         */

        /*Component cpu = new Component("13700k", 450);
        // cpu.name = "13700k";
        // cpu.price = 450;

        Component gpu = new Component();
        gpu.setName("RTX4090");
        gpu.setPrice(1499);


        partslist.add(cpu);
        partslist.add(gpu);*/

            for (int i = 0; i < partslist.size(); i++) {
                System.out.println(partslist.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hey you lost your file!");;
        }






    }
}
