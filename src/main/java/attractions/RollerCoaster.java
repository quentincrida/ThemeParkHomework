package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean permission = false;
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            permission = true;
        }
        return permission;
    }
}
