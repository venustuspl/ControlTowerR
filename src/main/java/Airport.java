import java.util.List;
import java.util.ArrayList;


public class Airport{
    private int id;
    private String name;

    List <Airport> airports = new ArrayList();

    public Airport(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getAirportId(){
        return this.id;
    }

    public void addToAirports(Airport airport){
        this.airports.add(airport);
    }

    public List getAirports (Airport aiport){
        return this.airports;
    }

    public int findFlight(Airport airport1, Airport airport){
        int result = 0;
        if (airports.size() >0){
            for(Airport entry : airports){
                if (entry.getAirportId() == airport.getAirportId()){
                    result = entry.getAirportId();
                    System.out.println(result);
                    //return result;
                    break;

                }else{
                    System.out.println("wchodzę do " + entry.getAirportId());
                    findFlight(entry,airport);
                }

            }
        }
        return result;

    }

}

