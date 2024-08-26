public class Pepperoni extends Pizza{
    private boolean isSpicy;

    public Pepperoni(double price, double weight, boolean isSpicy) {
        super("Pepperoni", price, weight);
        this.isSpicy = isSpicy;
    }

    @Override
    public String getLabel() {
        return "Пицца: " + name + "\n" +
                "Цена: " + price + " руб.\n" +
                "Вес: " + weight + " г.\n" +
                "Острая: " + (isSpicy ? "Да" : "Нет");
    }
}
