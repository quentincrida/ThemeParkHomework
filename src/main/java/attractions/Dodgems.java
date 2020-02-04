package attractions;

public class Dodgems extends Attraction {
    public double defaultPrice;

    public Dodgems(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }
        public double getDefaultPrice(){
            return defaultPrice;
        }

}
