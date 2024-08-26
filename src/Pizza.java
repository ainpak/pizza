public abstract class Pizza {
    protected String name;
    protected double price;
    protected double weight;

    public Pizza(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    public abstract String getLabel();


    public void prepare() {
        System.out.println("Готовится пицца " + name);
    }


    public void deliver() {
        System.out.println("Доставка пиццы: ");
        System.out.println(getLabel());
    }
}


