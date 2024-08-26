public class Main {
    public static void main(String[] args) {

        Pizza pepperoniSpicy = new Pepperoni(500, 300, true);
        Pizza pepperoniMild = new Pepperoni(480, 300, false);
        Pizza margaritaWithMeat = new Margarita(450, 350, true);
        Pizza margaritaVegetarian = new Margarita(400, 350, false);
        Pizza laFintaWithMushrooms = new LaFinta(520, 320, true);
        Pizza laFintaWithoutMushrooms = new LaFinta(490, 320, false);


        pepperoniSpicy.prepare();
        margaritaWithMeat.prepare();
        laFintaWithMushrooms.prepare();


        pepperoniSpicy.deliver();
        margaritaVegetarian.deliver();
        laFintaWithoutMushrooms.deliver();
    }
}