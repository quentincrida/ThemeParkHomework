package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall
        implements ISecurity
        {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean permission = false;
        if(visitor.getAge() > 18) {
            permission = true;
        }
        return permission;
}


    }