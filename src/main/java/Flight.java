import java.util.List;

class Flight {


    public Boolean findFlight(Airport start, Airport end) {

        Boolean result = false;

        if (start.getAirports().size() > 0) {

            for (Airport entry : start.getAirports()) {

                if (entry.getAirportName() == end.getAirportName()) {

                    result = true;

                    break;


                } else {

                    findFlight(entry, end);
                }

            }

        }
        return result;
    }
}