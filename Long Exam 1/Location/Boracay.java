package Location;
import Tourists.*;

public class Boracay implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}