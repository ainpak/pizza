public class Margarita extends Pizza{
    private boolean hasMeat;

    public Margarita(double price, double weight, boolean hasMeat) {
        super("Margarita", price, weight);
        this.hasMeat = hasMeat;
    }

    @Override
    public String getLabel() {
        return "Пицца: " + name + "\n" +
                "Цена: " + price + " руб.\n" +
                "Вес: " + weight + " г.\n" +
                "С мясом: " + (hasMeat ? "Да" : "Нет");
    }
}
