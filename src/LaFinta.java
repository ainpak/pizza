public class LaFinta extends Pizza{
    private boolean hasMushrooms;

    public LaFinta(double price, double weight, boolean hasMushrooms) {
        super("La Finta", price, weight);
        this.hasMushrooms = hasMushrooms;
    }

    @Override
    public String getLabel() {
        return "Пицца: " + name + "\n" +
                "Цена: " + price + " руб.\n" +
                "Вес: " + weight + " г.\n" +
                "С грибами: " + (hasMushrooms ? "Да" : "Нет");
    }
}
