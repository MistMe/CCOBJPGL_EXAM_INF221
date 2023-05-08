package Tourists;
import Location.Boracay;
import Location.Bohol;
import Location.Cebu;
import Location.Coron;
import Location.ElNido;
import Location.Palawan;
import Location.Locations;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Bohol bohol);
    void visit(Cebu cebu);
    void visit(Coron coron);
    void visit(ElNido elnido);
    void visit(Palawan palawan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}