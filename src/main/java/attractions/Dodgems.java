package attractions;

import people.Visitor;

public class Dodgems extends Attraction {
    public double defaultPrice;

    public Dodgems(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }
        public double getDefaultPrice(){
            return defaultPrice;
        }


    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12) {
            return defaultPrice / 2;
             }  else {
                    return defaultPrice;
                }
            }
        }


