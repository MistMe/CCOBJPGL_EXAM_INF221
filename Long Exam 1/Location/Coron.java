package Location;
import Tourists.*;

public class Coron implements Locations {

    public int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}