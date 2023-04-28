package Activity30;

import java.util.HashMap;

public class HashmapTest {
    public static void main(String[] args) {
        Hashmap capitalCities = new Hashmap();
        capitalCities.addValues("Indianapolis", "Indiana");
        capitalCities.addValues("Atlanta", "Georgia");
        capitalCities.addValues("Chicago", "Illinois");
        capitalCities.displayValues();
        capitalCities.removeValues("Atlanta");
        capitalCities.displayValues();
    }
}
