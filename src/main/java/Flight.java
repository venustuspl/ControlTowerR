import java.util.List;

class Flight {

    public Boolean findFlight(Airport start, Airport end) {
        if (start.getAirports() == null) {
            return false;
        }

        if (start.getAirports().contains(end)) {
            return true;
        }

        for (Airport entry : start.getAirports()) {

            if (findFlight(entry, end)) {

                return true;
            }
        }
        return false;
    }
}