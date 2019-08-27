import java.util.List;

class Flight {
    private boolean result = false;

    public Boolean findFlight(Airport start, Airport end) {


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