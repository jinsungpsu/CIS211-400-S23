public class Component {
    private double price;
    private String name;

    // in order to interact with private data
    // we can use constructors or setters or getters

    public Component() {
        price = 100;
        this.name = "no name component";
    }

    public Component(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
