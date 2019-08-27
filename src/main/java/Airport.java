import java.util.List;
import java.util.ArrayList;


public class Airport {

    private String name;

    private List<Airport> airports = new ArrayList();

    public Airport(String name) {
        this.name = name;
    }

    public String getAirportName() {

        return this.name;
    }

    public void addToAirports(Airport airport) {

        this.airports.add(airport);
    }

    public ArrayList<Airport> getAirports() {

        return (ArrayList<Airport>) this.airports;
    }


}

