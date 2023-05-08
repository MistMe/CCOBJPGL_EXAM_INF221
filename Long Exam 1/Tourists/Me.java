package Tourists;
import Location.Boracay;
import Location.Bohol;
import Location.Cebu;
import Location.Coron;
import Location.ElNido;
import Location.Palawan;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget >= boracay.airFare) {
            budget -= boracay.airFare;
            System.out.println("Visiting Boracay");
        } else {
            System.out.println("Not enough budget to visit Boracay");
        }
        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (budget >= palawan.airFare) {
            budget -= palawan.airFare;
            System.out.println("Visiting Palawan");
        } else {
            System.out.println("Not enough budget to visit Palawan");
        }
        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget >= cebu.airFare) {
            budget -= cebu.airFare;
            System.out.println("Visiting Cebu");
        } else {
            System.out.println("Not enough budget to visit Cebu");
        }
        checkBudget();
    }

    public void visit(Coron coron) {
        if (budget >= coron.airFare) {
            budget -= coron.airFare;
            System.out.println("Visiting Batanes");
        } else {
            System.out.println("Not enough budget to visit Batanes");
        }
        checkBudget();
    }

    public void visit(ElNido elnido) {
        if (budget >= elnido.airFare) {
            budget -= elnido.airFare;
            System.out.println("Visiting Siargao");
        } else {
            System.out.println("Not enough budget to visit Siargao");
        }
        checkBudget();
    }

    public void visit(Bohol bohol) {
        if (budget >= bohol.airFare) {
            budget -= bohol.airFare;
            System.out.println("Visiting Bohol");
        } else {
            System.out.println("Not enough budget to visit Bohol");
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}