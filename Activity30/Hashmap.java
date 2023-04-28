package Activity30;
import java.util.HashMap;
public class Hashmap {
    HashMap<String, String> capitalCities = new HashMap<>();

    public void addValues(String city, String state){
        capitalCities.put(city, state);
    }
    public void removeValues(String city){
        capitalCities.remove(city);
    }
    public Object getValue(String city){
        Object state;
        if(capitalCities.containsKey(city)) {
            state = capitalCities.get(city);
        }
        else{
            state = "City not found.";
        }
        return state;
    }
    public void displayValues(){
        capitalCities.forEach((city, state) -> {
            System.out.printf("%s, %s\n", city, state);
        });
        System.out.println("=================");
    }
}
