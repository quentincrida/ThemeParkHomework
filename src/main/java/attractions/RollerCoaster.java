package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double defaultPrice;

    public RollerCoaster(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }
    @Override
    public boolean isAllowedTo(Visitor visitor){
        boolean permission = false;
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            permission = true;
        }
        return permission;
    }
    @Override
    public double defaultPrice(){
        return defaultPrice;
        }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200) {
            return defaultPrice * 2;
        } else {
            return defaultPrice;
        }
    }



}


